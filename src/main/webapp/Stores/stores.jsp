<%--
  Created by IntelliJ IDEA.
  User: phuon
  Date: 8/27/2022
  Time: 6:59 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.example.demo.dao.StoreDao" %>
<%@ page import="com.example.demo.entity.Store" %>
<%@ page import="java.util.List" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css">
    <title>List Stores</title>
</head>
<body>
<div class="container">
    <!-- Content here -->
    <h1>Stores</h1>

    <%
        StoreDao stores = new StoreDao();
        List<Store> items = stores.getAll();
        for (Store m : items) {
    %>

    <div class="card" style="width: 18rem;">
        <div class="card-body">
            <h5 class="card-title"><%= m.getName() %></h5>
            <p class="card-text"><%= m.getAddress() %> - <%= m.getPhone() %></p>
            <a href="../InsertBook/insert_book.jsp?store_id=<%= m.getId() %>" class="btn btn-primary">Add book</a>
        </div>
    </div>

    <% } %>
</div>
</body>
</html>
