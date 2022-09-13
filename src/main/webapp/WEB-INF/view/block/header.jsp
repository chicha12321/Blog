<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<style>
    <%@include file='header.css' %>
</style>
<div th:fragment="content">
    <div class="header">
        <div class="header__section">
            <div class="header__item headerlogo">
                WDB
            </div>
            <div class="header__item headerButton"><a href="/publication">
                Publication</a></div>
            <div class="header__item headerButton"><a href="#">
                Profile</a></div>
            <div class="header__item headerButton"><a href="#">
                Лайфхаки</a></div>
            <div class="header__item headerButton"><a href="#">
                Технологии</a></div>
            <div class="header__item headerButton"><a href="#">
                Бизнесс</a></div>
        </div>
        <div class="header__section">
            <div class="header__item headerButton"><a href="#">
                Настройки</a></div>
            <div class="header__item headerButton"><a href="#">
                Войти</a></div>
        </div>

    </div>

</div>

</body>
</html>
