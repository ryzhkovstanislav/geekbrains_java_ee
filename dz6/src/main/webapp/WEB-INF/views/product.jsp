<%@ page import="company.ryzhkov.entity.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Object productObject = request.getAttribute("product");
    Product product = (Product) productObject;
%>

<!doctype html>
<html lang="ru-ru">

<jsp:include page="head.jsp">
    <jsp:param name="title" value="Главная"/>
</jsp:include>

<body>

<jsp:include page="nav.jsp">
    <jsp:param name="" value=""/>
</jsp:include>

<section>
    <div class="container">
        <h4 class="text-center p-3">Приветствуем Вас на сайте нашего интернет-магазина!</h4>
    </div>
</section>

<section>
    <div class="container">
        <h4 class="text-center p-3">Товар</h4>
        <div class="d-flex justify-content-center">
            <div class="m-3">
                <a class="d-block" href="">
                    <img src="/images/<%=product.getImage()%>" alt="">
                    <p><%=product.getCategory()%></p>
                    <p>Цена: <%=product.getPrice()%></p>
                    <p>Артикул: <%=product.getVendorCode()%></p>
                    <p>Категория: <%=product.getCategory()%></p>
                    <p>Описание: <%=product.getDescription()%></p>
                </a>
            </div>
        </div>
    </div>
</section>

<jsp:include page="scripts.jsp">
    <jsp:param name="" value=""/>
</jsp:include>

</body>
</html>
