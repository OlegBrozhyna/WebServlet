<%@ page import="com.example.webservlet.Customer" %>
<%@ page import="java.util.List" %><%----%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customers</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
    <style>
        table {
            margin-left: auto;
            margin-right: auto;
        }

        table, th, td {
            border: 1px solid black;
        }
    </style>
</head>
<body>
<div class="container">
    <h2>Customers table</h2>
    <table class="table table-silver table-striped table-bordered table-hover">
        <thead>
        <tr>
        <th>Name </th>
        <th>SurName</th>
        <th>Country</th>
        <th>Adres</th>
        <th>Product</th>
        <th>Company</th>
        <th>OrderData</th>
        <th>PhoneNumber</th>
        <th>Id</th>
        <th>FinanceId</th>
        <th>PostCode</th>
        <th>Kilogram</th>
    </tr>
    </thead>
    <tbody>
    <%

        List<Customer> customers = (List<Customer>) request.getAttribute("customerList");
        for (Customer customer : customers) {
            out.print("<tr><td>" +
                    customer.getName() + "</td><td>"
                    + customer.getSurName() + "</td><td>" + customer.getCountry() + "</td><td>"
                    + customer.getAdres() + "</td><td>" + customer.getProduct() + "</td><td>"
                    + customer.getCompany() + "</td><td>" +
                    +customer.getOrderData() + "</td><td>" +
                    customer.getPhoneNumber() + "</td><td>" + customer.getId() + "</td><td>"
                    + customer.getFinanceId() + "</td><td>" +
                    customer.getPostCode() + "</td><td>" + customer.getKilogram()
                    + "<tr><td>");



        }
    %>
    <%--            Variant 2 (using JSTL)--%>
    <%--        <c:if test="${customersList ne null}">--%>
    <%--            <c:forEach items="${customersList}" var="customer">--%>
    <%--                <tr>--%>
    <%--                    <td><c:out value="${customer.id}"/></td>--%>
    <%--                    <td><c:out value="${customer.name}"/></td>--%>
    <%--                    <td><c:out value="${customer.address}"/></td>--%>
    <%--                </tr>--%>
    <%--            </c:forEach>--%>
    <%--        </c:if>--%>

    </tbody>
        </table>
    </div>
</body>
</html>