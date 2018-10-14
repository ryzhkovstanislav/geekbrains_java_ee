<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
        <h4 class="text-center p-3">Приветствуем Вас на сайте нашего интернет-магазина!</h4>
    </div>
</section>

<jsp:include page="scripts.jsp">
    <jsp:param name="" value=""/>
</jsp:include>

</body>
</html>
