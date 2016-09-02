<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/include/header.jsp" %>
<%@include file="/WEB-INF/include/navbar.jsp" %>
<c:url value="/rent/delete" var="deleteRentUrl"/>

<div class="container text-center">

    <h1>List of Rents</h1>

    <div class="row">

        <div class="col-md-12">
            <table class="table table-bordered">

                <thead>
                <tr>
                    <th class="text-center col-md-1">Id</th>
                    <th class="text-center">Date rent</th>
                    <th class="text-center">Date return</th>
                    <th class="text-center">User</th>
                    <th class="text-center">Book</th>
                    <th class="text-center col-md-1">Delete</th>
                </tr>
                </thead>

                <tbody>
                <c:forEach var="rent" items="${rentList}">
                    <tr>
                        <td class="text-center col-md-1">${rent.id}</td>
                        <td class="text-center">${rent.rentDate}</td>
                        <td class="text-center">${rent.returnDate}</td>
                        <td class="text-center">${rent.user.firstName}
                         ${rent.user.lastName}</td>
                        </td>
                        <td class="text-center">${rent.book.title}
                                (${rent.book.author})</td>
                        </td>
                        <td class="text-center">
                            <a href="${deleteRentUrl}/${rent.id}"
                               class="btn btn-sm btn-danger delete-button">Delete</a>
                        </td>
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>

    </div>

</div>
<script>
    $(function() {
        $('.delete-button').on('click', function(event) {
            console.log(event);
            event.preventDefault();
            var url = event.target.href;
            $.get(url, {
                '${_csrf.parameterName}': '${_csrf.token}'
            })
                    .done(function() {
                        location.reload();
                    });
        });
    });
</script>