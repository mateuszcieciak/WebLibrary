<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/include/header.jsp" %>

<c:url value="/register" var="registerUrl"/>
<c:url value="/login" var="loginUrl"/>

<div class="container">

    <c:if test="${param.logout!=null}">
        <div class="alert alert-success fade in">
            <a class="close" data-dismiss="alert" href="#">&times;</a>
            <p>You've logged out</p>
        </div>
    </c:if>

    <c:if test="${param.register!=null}">
        <div class="alert alert-info fade in">
            <a class="close" data-dismiss="alert" href="#">&times;</a>
            <p>Register successful. You can log in</p>
        </div>
    </c:if>

    <c:if test="${param.error!=null}">
        <div class="alert alert-danger fade in">
            <a class="close" data-dismiss="alert" href="#">&times;</a>
            <p>Username or password is incorrect</p>
        </div>
    </c:if>

    <div class="card card-container">
        <h4> Login to your account</h4>
        <form action="${loginUrl}" method="post" class="form-signin">
            <input name="email" type="email" id="inputEmail" class="form-control"
                   placeholder="Email address" required autofocus>
            <input name="password" type="password" id="inputPassword" class="form-control"
                   placeholder="Password" required>
            <div id="remember" class="checkbox">
                <label>
                    <input type="checkbox" value="remember-me"> Remember me
                </label>
            </div>
            <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in
            </button>
        </form>
        <div class="margin-bottom-10">
            <a href="#" class="forgot-password">Forgot the password?</a>
        </div>
        <div class="margin-bottom-10">
            Don't have account? <a href="${registerUrl}" class="register">Create account</a>
        </div>
    </div>
</div>