<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf8">
    <title>Products</title>
</head>
<body>
<div>
    <h2 align="center">Таблица товаров</h2>
    <table border="1" width="800" align="center" cellpadding="10">
        <tr align="center">
            <th>Наименование</th>
            <th>Описание</th>
            <th>Производитель</th>
            <th>Цена</th>
            <sec:authorize access="hasRole('ADMIN')">
                <th>Удалить</th>
                <th>Изменить</th>
            </sec:authorize>
        </tr>
        <c:forEach items="${productList}" var="product">
            <tr align="center">
                <td>${product.productName}</td>
                <td>${product.productDescription}</td>
                <td>${product.productManufacturer}</td>
                <td>${product.productCost}</td>

                <form action="/product/delete${product.productId}" method="get"><input type="submit" value="Удалить"></form>

                <form action="/product/update_product${product.productId}" method="get"><input type="submit"
                                                                                            value="Изменить"></form>
            </tr>
        </c:forEach>
    </table>
</div>

    <div>
        <form action="${pageContext.request.contextPath}/product/validate" method="get">
            <input type="submit" value="Добавить новый продукт"/>
        </form>
    </div>
<form action="${pageContext.request.contextPath}/main" method="get"><input type="submit" value="Назад на главную"></form>
</body>
</html>
