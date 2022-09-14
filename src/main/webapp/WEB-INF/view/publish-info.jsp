<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Information about post</title>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/publish-info.css"/>'>
</head>
<body>
<jsp:include page="../../resources/block/header.jsp"></jsp:include>

<h1>Information about post </h1>
<div class="formInput">
    <form:form action="savePost" modelAttribute="publishPost">
        <form:hidden path="id"></form:hidden>

        <div class="textcols">
            <div class="textcols-item">
                <ul>
                    <li>Name author</li>
                    <li>Title post</li>
                    <li>Your description</li>
                    <li><input  id="btn-save" type="submit" value="Save"></li>
                </ul>
            </div>
            <div class="textcols-item">
                <ul>
                    <li><form:input path="nameAuthor"/></li>
                    <li><form:input path="titlePost"/></li>
                    <li><form:textarea type="text" id="input__description" path="description"/></li>
                </ul>
            </div>
            <br>
        </div>
        <%--        была тут кнопка--%>
    </form:form>
</div>
</body>
</html>
