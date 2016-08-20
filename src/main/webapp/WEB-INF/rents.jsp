<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@include file="/WEB-INF/include/header.jsp" %>
<%@include file="/WEB-INF/include/navbar.jsp" %>

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
                    </tr>
                </c:forEach>
                </tbody>
            </table>

        </div>

    </div>

</div>