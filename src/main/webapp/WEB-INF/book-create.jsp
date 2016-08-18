<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/include/header.jsp" %>
<%@ include file="/WEB-INF/include/navbar.jsp" %>

<c:url value="/book/save" var="createBookUrl"/>

<div class="container text-center" >

    <h1>Create book</h1>

    <div class="row">
        <form action="${createBookUrl}" method="post" role="form" class="form-horizontal">
            <div class="form-group">
                <label class="control-label col-sm-2" for="title">Title:</label>
                <div class="col-sm-8">
                    <input name ="title" type="text" id="title" class="form-control"
                           placeholder="Enter book title"
                           autofocus>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="author">Author:</label>
                <div class="col-sm-8">
                    <input name ="author" type="text" id="author" class="form-control"
                           placeholder="Enter book author" autofocus>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="available">Available:</label>
                <div class="col-sm-8">
                    <input name ="available" type="number" id="available" class="form-control"
                           placeholder="Enter number of available books" autofocus>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-8">
                    <button type="submit" class="btn btn-primary">Save</button>
                    <a href="#" class="btn btn-danger">Cancel</a>
                </div>
            </div>
        </form>
    </div>

</div>
