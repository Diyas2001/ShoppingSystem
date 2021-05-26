<%@ page import="com.example.ShoppingSystem.Tables.Products" %>
<%@ page import="com.example.ShoppingSystem.Tables.Users" %>
<html>
<head>
    <title>Online Shop</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>
<%@include file="navbar.jsp"%>

<jsp:useBean id="users" type="java.util.List<com.example.ShoppingSystem.Tables.Users>" scope="request"/>
<section class="about">
    <div class="container">
        <table class="table table-dark table-striped">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">name</th>
                <th scope="col">username</th>
                <th scope="col">password</th>
            </tr>
            </thead>
            <tbody>
            <%for(Users us: users){%>
            <tr>
                <th scope="row"><%=us.getId()%></th>
                <td><%=us.getName()%></td>
                <td><%=us.getUsername()%></td>
                <td><%=us.getPassword()%></td>
            </tr>
            <%}%>
            </tbody>
        </table>

    </div>
</section>
</body>
</html>