<%--
  Created by IntelliJ IDEA.
  User: Nw
  Date: 2020/8/1
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
<form action="login" method="post">
    ${error}
    <hr>
    <h2>登录</h2>
    <table>
        <tr>
            <td>用户名:</td>
            <td><input type="text" id="user-name-label" name="username"></td>
        </tr>
        <tr>
            <td>密码：</td>
            <td><input type="password" id="password-label" name="password"></td>
        </tr>
        <tr>
            <td>
                remember me
            </td>
            <td><input type="checkbox" name="rememberme" id="security-always-trust-checkbox" value="true"></td>
        </tr>
        <tr>
            <td>
                <button type="submit" id="bottom-text">登录</button>
            </td>
            <td>
                <button type="button" id="bottom-text">注册</button>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
