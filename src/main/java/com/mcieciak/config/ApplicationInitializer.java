package com.mcieciak.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.DispatcherType;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;
import java.util.EnumSet;

// Tworzenie DispatcherServlet

public class ApplicationInitializer implements WebApplicationInitializer {

    private static final EnumSet<DispatcherType> DISPATCHER_TYPES = EnumSet.of(DispatcherType
            .REQUEST, DispatcherType.FORWARD);

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext applicationContext = new
                AnnotationConfigWebApplicationContext();
        applicationContext.register(AppConfig.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);

        ServletRegistration.Dynamic servletRegistration
                = servletContext.addServlet("dispatcher", dispatcherServlet);

        // 1 to priorytet, oznacza, ze ten servlet jest najwazniejszy
        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/");

        // Filtr do polskich znakow
        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
        characterEncodingFilter.setEncoding("UTF-8");
        characterEncodingFilter.setForceEncoding(true);
        servletContext.addFilter("characterEncodingFilter", characterEncodingFilter)
                .addMappingForUrlPatterns(null, true, "/*");

        // Filtr do security
        DelegatingFilterProxy delegatingFilterProxy=new DelegatingFilterProxy();
        servletContext.addFilter("springSecurityFilterChain", delegatingFilterProxy)
                .addMappingForUrlPatterns(null, true, "/*");

    }
}
