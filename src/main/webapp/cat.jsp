<%@ page import="com.ph.entity.Cat" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: filyakov.a
  Date: 17.11.2021
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cats</title>
</head>
<body>
    <h2>Cat</h2>
    <p>Name: ${cat.name}</p>
    <p>Age: ${cat.age}</p>
    <p>Children</p>
    <hr>
    <ul>
        <% for (Cat value: (List<Cat>)((Cat)request.getAttribute("cat")).getChildren()) { %>
            <li>name: <%=value.getName()%>; age : <%=value.getAge()%> </li>
        <% } %>

    </ul>
    <hr>

</body>
</html>
