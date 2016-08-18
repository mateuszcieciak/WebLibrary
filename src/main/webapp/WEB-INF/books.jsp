<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/include/header.jsp"%>
<%@include file="/WEB-INF/include/navbar.jsp"%>

<c:url value="/book/edit" var="editBookUrl"/>

<div class="container text-center">

    <h1>List of Books</h1>

    <div class="row">

        <div class="col-md-12">
            <table class="table table-bordered">

                <thead>
                <tr>
                    <th class="text-center col-md-1">Id</th>
                    <th class="text-center">Title</th>
                    <th class="text-center">Author</th>
                    <th class="text-center col-md-1">Available</th>
                    <th class="text-center col-md-1">Action</th>
                    <th class="text-center col-md-1">Edit</th>
                    <th class="text-center col-md-1">Delete</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="book" items="${bookList}">
                <tr>
                    <td class="text-center col-md-1">${book.id}</td>
                    <td class="text-center">${book.title}</td>
                    <td class="text-center">${book.author}</td>
                    <td class="text-center col-md-1">${book.available}</td>
                    <td class="text-center"><a href="" class="btn btn-sm btn-primary">Rent</a></td>
                    <td class="text-center"><a href="${editBookUrl}/${book.id}" class="btn btn-sm
                    btn-success">Edit</a></td>
                    <td class="text-center">
                        <a href="" class="btn btn-sm btn-danger delete-button">Delete</a>
                    </td>
                </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>

    </div>

</div>




