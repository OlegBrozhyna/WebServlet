<%@ page import="com.example.webservlet.Customer" %>
<%@ page import="java.util.List" %><%----%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customers</title>
    <style>

        table, th, td{
            border: 1px solid black;
        }
    </style>
</head>
<body>
<table>
    </thead>
    <tbody
    <%

        List<Customer> customers = (List<Customer>) request.getAttribute("customerList");
        for (Customer customer : customers) {
            response.getWriter().println(
                    "<ol>"
                            + "<p>"
                            + "<table> "
                            + "<tr><td> Name:" + customer.getName() + "<td> SurName:"
                            + customer.getSurName() + "<td>Country:" + customer.getCountry() + "<td>Adres:"
                            + customer.getAdres() + "<td>Product:" + customer.getProduct() + "<td>Company:" +
                            customer.getCompany() +
                            "<td>OrderData:" + customer.getOrderData() + "<td>PhoneNumber:" +
                            customer.getPhoneNumber() + "<td>Id:" + customer.getId() + "<td>FinanceId"
                            + customer.getFinanceId() +
                            "<td>PostCode" + customer.getPostCode() + "<td>Kilogram" + customer.getKilogram()
                            + "<td><tr>"
                            + "<p>"
                            + "<ol>");


            //  response.getWriter().println(customers.get(0));
            // response.getWriter().println(customers.get(1));


        }
    %>

    </tbody>
</table>
</body>
</html>