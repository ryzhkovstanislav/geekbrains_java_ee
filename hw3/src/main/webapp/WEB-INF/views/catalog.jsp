<%@ page import="company.ryzhkov.constants.Constants" %>
<%@ page import="java.util.Collection" %>
<%@ page import="company.ryzhkov.entity.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Object productsObject = request.getAttribute(Constants.PRODUCTS);
    Collection<Product> products = (Collection<Product>) productsObject;
%>

<!doctype html>
<html lang="ru-ru">

<jsp:include page="../../head.jsp">
    <jsp:param name="title" value="Catalog"/>
</jsp:include>

<body>

<jsp:include page="../../nav.jsp">
    <jsp:param name="" value=""/>
</jsp:include>

<section>
    <div class="container">
        <h4 class="text-center p-3">Каталог товаров</h4>
        <div class="d-flex justify-content-center">
            <% for (Product product : products) { %>
            <div class="m-3">
                <a class="d-block" href="product?id=<%=product.getId()%>">
                    <img src="../../images/<%=product.getImage()%>" alt="im001">
                    <p><%=product.getCategory()%></p>
                    <p>Цена: <%=product.getPrice()%></p>
                </a>
            </div>
            <% } %>
        </div>
    </div>
</section>

<jsp:include page="../../scripts.jsp">
    <jsp:param name="" value=""/>
</jsp:include>

</body>
</html>
