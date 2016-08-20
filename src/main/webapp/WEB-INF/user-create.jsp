<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/include/header.jsp" %>
<%@ include file="/WEB-INF/include/navbar.jsp" %>

<div class="container">

    <h1>Create user</h1>

    <div class="row">
        <form role="form" class="form-horizontal">
            <div class="form-group">
                <label class="control-label col-sm-2" for="firstName">First name:</label>
                <div class="col-sm-6">
                    <input type="text" id="firstName" class="form-control"
                           placeholder="Enter first name" autofocus>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="lastName">Last name:</label>
                <div class="col-sm-6">
                    <input type="text" id="lastName" class="form-control"
                           placeholder="Enter last name" autofocus>
                </div>
            </div>
            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-6">
                    <button type="submit" class="btn btn-primary">Save</button>
                    <a href="#" class="btn btn-danger">Cancel</a>
                </div>
            </div>
        </form>
    </div>

</div>