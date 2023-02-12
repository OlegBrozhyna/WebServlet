<%@ page import="java.time.DayOfWeek" %>
<%@ page import="java.time.LocalDate" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head><title>DayOfWeek</title>
</head>
<body>
<%
    DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
    response.getWriter().println(dayOfWeek);
%>

</body>
</html>
