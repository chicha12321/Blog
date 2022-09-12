<%@ taglib prefix="C" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>homepage</title>
</head>
<body>
 <style>
     <%@include file='css/main.css' %>
 </style>
<jsp:include page="block/header.jsp"></jsp:include>
<h2>All publication of posts</h2>
<br>
<table>
    <thead>
    <tr>
        <th>Name author</th>
        <th>Title post</th>
        <th>Description</th>
        <th>Operations</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="pst" items="${allPosts}">
        <c:url var="updateButton" value="/updatePost" >
            <c:param name="publishPostId" value="${pst.id}"/>
        </c:url>
        <c:url var="removeButton" value="/removePost" >
            <c:param name="publishPostId" value="${pst.id}"/>
        </c:url>

        <tr>
            <td>${pst.nameAuthor}</td>
            <td>${pst.titlePost}</td>
            <td>${pst.description}</td>
            <td>
                <input type="button" value="update" onclick="window.location.href='${updateButton}'"/>
                <input type="button" value="delete" onclick="window.location.href='${removeButton}'"/>
            </td>
        </tr>

    </c:forEach>
    <tbody>
</table>
<br>
<input type="button" value="add" onclick="window.location.href='addNewPost'">


</body>
</html>
