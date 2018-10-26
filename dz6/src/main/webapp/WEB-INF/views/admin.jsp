<%@ page import="company.ryzhkov.entity.Product" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>

<%
    Object productsObject = request.getAttribute("products");
    List<Product> products = (List<Product>) productsObject;
%>

<!doctype html>
<html lang="ru-ru">

<jsp:include page="head.jsp">
    <jsp:param name="title" value="Main"/>
</jsp:include>

<body>

<jsp:include page="nav.jsp">
    <jsp:param name="" value=""/>
</jsp:include>

<section>
    <div class="container">
        <h4 class="text-center p-3">Панель администратора</h4>
        <div class="d-flex justify-content-center">
            <form method="post" action="admin" enctype="application/x-www-form-urlencoded">
                <div>
                    <label for="vendorCode">Артикул</label>
                    <input id="vendorCode" type="text" name="vendorCode" value="" required>
                </div>
                <div>
                    <label for="category">Категория</label>
                    <input id="category" type="text" name="category" value="" required>
                </div>
                <div>
                    <label for="price">Цена</label>
                    <input id="price" type="number" name="price" value="" required>
                </div>
                <div>
                    <label for="image">Картинка</label>
                    <input id="image" type="text" name="image" value="" required>
                </div>
                <div>
                    <label for="description">Описание</label>
                    <input id="description" type="text" name="description" value="" required>
                </div>
                <div>
                    <button type="submit">Отправить</button>
                </div>
            </form>
        </div>
    </div>
</section>
<section>
    <div class="container">
        <h4 class="text-center p-3">Товары</h4>
        <div class="d-flex justify-content-center">
            <% for (Product product : products) { %>
            <div class="m-3">
                <span><%=product.getCategory()%> </span>
                <span><%=product.getVendorCode()%> </span>
                <span>
                    <a href="/delete?id=<%=product.getId()%>">Удалить</a>
                </span>
            </div>
            <% } %>
        </div>
    </div>
</section>

<jsp:include page="scripts.jsp">
    <jsp:param name="" value=""/>
</jsp:include>

