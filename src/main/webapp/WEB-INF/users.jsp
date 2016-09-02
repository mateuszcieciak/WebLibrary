<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/include/header.jsp" %>
<%@include file="/WEB-INF/include/navbar.jsp" %>

<c:url value="/api/users" var="userListJSON"/>
<c:url value="/user/delete" var="deleteUserUrl"/>

<div class="container text-center">

    <h1>List of Users</h1>

    <div class="row">

        <div class="col-md-12">
            <table class="table table-bordered">

                <thead>
                <tr>
                    <th class="text-center col-md-1">Id</th>
                    <th class="text-center">First name</th>
                    <th class="text-center">Last name</th>
                    <th class="text-center">Email</th>
                    <th class="text-center">Role</th>
                    <th class="text-center col-md-1">Delete</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="user" items="${userList}">
                    <tr>
                        <td class="text-center col-md-1">${user.id}</td>
                        <td class="text-center">${user.firstName}</td>
                        <td class="text-center">${user.lastName}</td>
                        <td class="text-center">${user.email}</td>
                        <td class="text-center">${user.role}</td>
                        <td class="text-center">
                            <a href="${deleteUserUrl}/${user.id}"
                               class="btn btn-sm btn-danger delete-button">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-8">
                <a href="${userListJSON}" class="btn btn-success">Generate JSON</a>
            </div>
        </div>
    </div>
</div>
<script>
    $(function() {
        $('.delete-button').on('click', function(event) {
            console.log(event);
            event.preventDefault();
            var url = event.target.href;
            $.post(url);
            location.reload();
        });
    });
</script>
