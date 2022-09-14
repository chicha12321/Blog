<%@ taglib prefix="C" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>All publication</title>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/allPublication.css"/>'>

</head>
<body>
<jsp:include page="../../resources/block/header.jsp"></jsp:include>

<div id="grid">

    <div>
        <img class="img__icon" src='<c:url value="/resources/image/profile.png"></c:url>'/>

        <div class="name__author">Name author</div>
        <div class="name__title">Title</div>
        <a id="addNewPost" href="addNewPost">Add new post?</a>
    </div>

    <c:forEach var="pst" items="${allPosts}">
        <div>
            <img class="img__icon" src='<c:url value="/resources/image/profile.png"></c:url>'/>

            <div class="name__author">${pst.nameAuthor}</div>
            <div class="name__title">${pst.titlePost}</div>
            <a href="/publication/${pst.id}">
                <div class="description">${pst.description}</div>
            </a>
        </div>
    </c:forEach>
</div>

</body>
</html>
