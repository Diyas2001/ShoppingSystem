<%@ page import="com.example.ShoppingSystem.Tables.Products" %>
<html>
<head>
    <title>Online Shop</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>
<%@include file="navbar.jsp"%>

<jsp:useBean id="products" type="java.util.List<com.example.ShoppingSystem.Tables.Products>" scope="request"/>
<section class="about">
    <div class="container">
        <table class="table table-dark table-striped">
            <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">name</th>
                <th scope="col">username</th>
                <th scope="col">price</th>
            </tr>
            </thead>
            <tbody>
            <%for(Products pr: products){%>
            <tr>
                <th scope="row"><%=pr.getId()%></th>
                <td><%=pr.getName()%></td>
                <td>username</td>
                <td><%=pr.getPrice()%></td>
            </tr>
            <%}%>
            </tbody>
        </table>

    </div>
</section>
</body>
</html>