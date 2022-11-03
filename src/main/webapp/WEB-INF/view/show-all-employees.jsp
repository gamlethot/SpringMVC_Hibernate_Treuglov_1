<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Slims
  Date: 01.11.2022
  Time: 18:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show All Employees</title>
</head>
<body>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
        <th>Options</th>
    </tr>

        <c:forEach var="empl" items="${allEmps}">
            <c:url var="updateButton" value="/update">
                <c:param name="id" value="${empl.id}"/></c:url>
            <c:url var="deleteButton" value="/delete">
                <c:param name="id" value="${empl.id}"/></c:url>
    <tr>
        <td>${empl.name}</td>
        <td>${empl.surname}</td>
        <td>${empl.department}</td>
        <td>${empl.salary}</td>
        <td>
            <button name="Edit" value="Edit" onclick="window.location.href='${updateButton}'">Edit</button>
            <button name="Delete" value="Delete" onclick="window.location.href='${deleteButton}'">Delete</button>
        </td>
    </tr>
        </c:forEach>
</table>
<button name="Add" value="Add" onclick="window.location.href='/add'">Add</button>
</body>
</html>
