<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/3/7 0007
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
</head>
<body>

    <form action="/submitLogin" method="post">
        用户名：<input type="text" name="userName" >
        密码：<input type="password" name="password">
        <input type="submit" value="登录">
    </form>
</body>
</html>
