<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Welcome!</title>
</head>
<body>
<div align="center">
    <form:form action="/product/list" method="get">
        <input type="submit" value="Список товаров">
    </form:form>
</div>
</body>
</html>
