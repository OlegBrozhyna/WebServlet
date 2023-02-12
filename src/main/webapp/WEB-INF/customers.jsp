<%@ page import="java.util.List" %>
<%@ page import="com.example.webservlet.Customer" %>
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
