<%--
  Created by IntelliJ IDEA.
  User: Nw
  Date: 2020/8/1
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
    <script>
        function countTime() {
            var time = document.getElementById("Time");
            if (time.innerHTML == 0) {
                window.location.href = "login.jsp";
            } else {
                time.innerHTML = time.innerHTML - 1;
            }
        }
        window.setInterval(countTime, 5000);
    </script>
</head>
<body>
    <h1>错误,<p id="Time">5</p>秒后跳转到登录界面，或<a href="login.jsp">点击这里</a></h1>
</body>
</html>
