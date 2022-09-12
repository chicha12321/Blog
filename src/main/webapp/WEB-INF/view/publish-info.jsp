<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Information about post</title>
</head>
<body>
<h1>Information about post</h1>
<form:form action="savePost" modelAttribute="publishPost">
    <form:hidden path="id"></form:hidden>
    Name author <form:input path="nameAuthor"/>
    <br>
    Title Post <form:input path="titlePost"/>
    <br>
    Your description<form:input path="description"/>
    <br>
    <input type="submit" value="save">
</form:form>
</body>
</html>
