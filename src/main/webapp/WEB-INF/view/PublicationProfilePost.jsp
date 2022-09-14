<%@ taglib prefix="C" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Post publication</title>
    <link rel="stylesheet" type="text/css" href='<c:url value="/resources/css/publicationProfilePost.css"/>'>
</head>
<body>
<jsp:include page="../../resources/block/header.jsp"></jsp:include>
<div class="container__informationProfile">
    <img class="img__icon" src='<c:url value="/resources/image/profile.png"></c:url>'/>
    <div class="textcols">
        <div class="textcols-item">
            <ul>
                <li> Full name</li>
                <li>Age</li>
                <li>Email</li>
            </ul>
        </div>
        <div class="textcols-item">
            <ul>
                <li> Adamyan Tigran Simonovich</li>
                <li>22</li>
                <li>asd@mail.ru</li>
            </ul>
        </div>
        <br>
    </div>
    <br>
    <div>About:</div>
    <br>
    <div>I am 22 years old.I'm still learning in university.I want to sleep:DI am 22 years old.I'm still learning in
        university.I want to sleep:DI am 22 years old.I'm still learning in university.I want to sleep:D
    </div>
    <button class="buttonGoBack" onclick="window.location.href='/publication'">Go back to all publication</button>
    <a id="addNewPost" href="/publication"></a>
</div>
<div class="container__informationPost">
    <div class="textcols">
        <div class="textcols-item">
            <ul>
                <li class="liInfoPost"> Alias:</li>
                <li class="liInfoPost">Title:</li>
            </ul>
        </div>
        <div class="textcols-item">
            <ul>
                <div class="name__author">${modelOnePublication.nameAuthor}</div>
                <div class="name__title">${modelOnePublication.titlePost}</div>
            </ul>
        </div>
        <br>
    </div>
    <br>
    <div>Description:</div>
    <div class="description">${modelOnePublication.description}</div>
    <hr>
    <div class="comments">
        <div class="outputComments">
            <c:forEach var="coment" items="${modelComments}">
                <text>${coment.comment}</text>
                <text id="date">${coment.dateComment}</text>
                <br>
            </c:forEach>
        </div>
        <div class="inputComments">
            <form:form action="${id}/saveComment" modelAttribute="comment">
                <form:input path="comment" type="text" placeholder="Write your comments"/>
                <%--                <form:hidden modelAttribute="postAttribute"  path="id"></form:hidden>--%>
                <input id="btn-1" type="submit" value="Add">
            </form:form>
        </div>
    </div>

</div>
</body>
</html>
