<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>new product</title>
</head>
<body>
<div align="center">
    <h3>Для добавления товаров:</h3>
    <form:form modelAttribute="productFromPage" method="post" action="/product/save">
        <p><label>Введите название продукта:<br>
            <form:input path="productName" size="30" maxlength="30"/></label></p>
        <p><label>Введите короткое описание:<br>
            <form:input path="productDescription" size="30" maxlength="255"/></label></p>
        <p><label>Производитель продукта:<br>
            <form:input path="productManufacturer" size="30" maxlength="30"/></label></p>
        <p><label>Цена:<br>
            <form:input path="productCost" size="30" maxlength="30"/></label></p>
        <p><form:button>Добавить</form:button></p>
    </form:form>
</div>
</body>
</html>

