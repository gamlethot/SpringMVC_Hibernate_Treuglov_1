<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="input" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Slims
  Date: 02.11.2022
  Time: 19:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>add-employee</title>
</head>
<body>
    <form:form name="employeeForm" modelAttribute="employee" action="/save">
        <form:hidden path="id" title="id"/>
        Name: <form:input path="name" title="Name"/> <br>
        Surname: <form:input path="surname" title="Surname"/> <br>
        Salary: <form:input path="salary" title="Salary"/> <br>
        Department: <form:input path="department" title="Department"/> <br>
        <form:button name="Save" value="Save">Save</form:button>
    </form:form>
</body>
</html>
