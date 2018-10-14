<%@ page import="company.ryzhkov.constants.Constants" %>
<%@ page import="company.ryzhkov.entity.Product" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    Object productObject = request.getAttribute(Constants.PRODUCT);
    Product product = (Product) productObject;
%>

<!doctype html>
<html lang="ru-ru">

<jsp:include page="../../head.jsp">
    <jsp:param name="title" value='<%=product.getVendorCode()%>'/>
</jsp:include>

<body>

<jsp:include page="../../nav.jsp">
    <jsp:param name="" value=""/>
</jsp:include>

<section>
    <div class="container">
        <h4 class="text-center p-3"><%=product.getCategory()%></h4>
        <div class="d-flex justify-content-center">
            <div class="m-3">
                <img src="../../images/<%=product.getImage()%>" alt="im001">
                <p>Артикул: <%=product.getVendorCode()%></p>
                <p>Цена: <%=product.getPrice()%></p>
                <p>Производитель: <%=product.getDescription()%></p>
            </div>
        </div>
    </div>
</section>

<jsp:include page="../../scripts.jsp">
    <jsp:param name="" value=""/>
</jsp:include>

</body>
</html>
