<%@ page import="com.ph.entity.Product" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: filyakov.a
  Date: 17.11.2021
  Time: 16:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
    <h2>Products</h2>
    <hr>
    <ul>

        <% for (Product product: (List<Product>)(request.getAttribute("products"))) { %>
        <li>id:<%=product.getId()%>, name_Product:<%=product.getTitle()%>, cost:<%=product.getCost()%> </li>
        <% } %>

    </ul>
    <hr>

</body>
</html>
