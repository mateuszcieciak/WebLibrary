<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="/WEB-INF/include/header.jsp" %>
<%@ include file="/WEB-INF/include/navbar.jsp" %>

<c:url value="/book/save" var="createBookUrl"/>
<c:url value="/books" var="booksUrl"/>

<div class="container text-center" >

    <h1>Create book</h1>

    <div class="row">
        <form action="${createBookUrl}" method="post" role="form" class="form-horizontal">
            <input type="hidden" name="id" value="${book.id}"/>
            <div class="form-group">
                <label class="control-label col-sm-2" for="title">Title:</label>
                <div class="col-sm-8">
                    <input value="${book.title}" name ="title" type="text" id="title"
                           class="form-control" placeholder="Enter book title" autofocus>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="author">Author:</label>
                <div class="col-sm-8">
                    <input value="${book.author}" name ="author" type="text" id="author"
                           class="form-control" placeholder="Enter book author" autofocus>
                </div>
            </div>
            <div class="form-group">
                <label class="control-label col-sm-2" for="available">Available:</label>
                <div class="col-sm-8">
                    <input value="${book.available}" name ="available" type="number" id="available"
                           class="form-control"
                           placeholder="Enter number of available books" min="0" autofocus>
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-8">
                    <button type="submit" class="btn btn-primary">Save</button>
                    <a href="${booksUrl}" class="btn btn-danger">Cancel</a>
                </div>
            </div>
        </form>
    </div>

</div>
