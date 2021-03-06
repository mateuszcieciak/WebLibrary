<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<c:url value="/books" var="booksUrl"/>
<c:url value="/book/create" var="createBookUrl"/>

<c:url value="/users" var="usersUrl"/>
<c:url value="/register" var="registerUrl"/>
<c:url value="/rents" var="myRentsUrl"/>

<c:url value="/logout" var="logoutUrl"/>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle collapsed" data-toggle="collapse"
                    data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
                <span class="sr-only">Toggle navigation</span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="#"></a>
        </div>

        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
            <ul class="nav navbar-nav">

                <sec:authorize access="hasRole('ADMIN')">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true" aria-expanded="false">Users <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="${registerUrl}">New...</a></li>
                        <li role="separator" class="divider"></li>
                        <li><a href="${usersUrl}">Show all</a></li>
                    </ul>
                </li>
                </sec:authorize>


                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true" aria-expanded="false">Books <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <sec:authorize access="hasRole('ADMIN')">
                        <li><a href="${createBookUrl}">New...</a></li>
                        </sec:authorize>
                        <li role="separator" class="divider"></li>
                        <li><a href="${booksUrl}">Show all</a></li>
                    </ul>
                </li>
                <sec:authorize access="hasRole('USER')">
                <li><a href="${myRentsUrl}">My rents</a></li>
                </sec:authorize>
            </ul>

            <ul class="nav navbar-nav navbar-right">
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button"
                       aria-haspopup="true" aria-expanded="false">
                        <sec:authentication property="principal.username"/>
                        <span class="caret"></span></a>
                    <ul class="dropdown-menu">
                        <li><a href="#">My account</a></li>
                        <li role="separator" class="divider"></li>
                        <li>
                            <a href="${logoutUrl}">Logout</a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
