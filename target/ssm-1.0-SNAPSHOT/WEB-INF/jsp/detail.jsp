<%--
  Created by IntelliJ IDEA.
  User: Nw
  Date: 2020/7/25
  Time: 16:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java"%>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Book Detail</title>
    <link href="../css/bootstrap.min.css" type="text/css" rel="stylesheet" >
    <script src="../js/jquery.min.js" type="text/javascript"></script>
    <script src="../js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
<br/>
<div class="box-123">
    <table class="table table-bordered">
        <tr>
            <th>图书详情</th>
            <th>..</th>
        </tr>
        <tbody id="cityCols">
        <tr>
            <td>书名</td>
            <td>${book.name}</td>
        </tr>
        <tr>
            <td>库存</td>
            <td>${book.number}</td>
        </tr>
        <tr>
            <td>简介</td>
            <td>${book.description}</td>
        </tr>
        <tr>
            <td>出版社</td>
            <td>${book.press}</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>

