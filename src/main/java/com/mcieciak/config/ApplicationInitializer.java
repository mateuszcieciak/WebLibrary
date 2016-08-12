package com.mcieciak.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * Created by Mateusz on 11.08.2016.
 */

// Tworzenie DispatcherServlet

public class ApplicationInitializer implements WebApplicationInitializer{
    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        AnnotationConfigWebApplicationContext applicationContext= new
                AnnotationConfigWebApplicationContext();
        applicationContext.register(AppConfig.class);

        DispatcherServlet dispatcherServlet = new DispatcherServlet(applicationContext);

        ServletRegistration.Dynamic servletRegistration
                =servletContext.addServlet("dispatcher", dispatcherServlet);
        // 1 to priorytet, oznacza, ze ten servlet jest najwazniejszy

        servletRegistration.setLoadOnStartup(1);
        servletRegistration.addMapping("/");

    }
}
