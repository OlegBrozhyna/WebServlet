<%@ page import="com.example.webservlet.Customer" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Oleg
  Date: 12.02.2023
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  List<Customer> customers = (List<Customer>) request.getAttribute("customerList");
  for (Customer customer : customers) {
    response.getWriter().println(customers.get(0));
    response.getWriter().println(customers.get(1));
  }
%>

</body>
</html>
