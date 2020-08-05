<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/7/29
  Time: 11:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="hade.jsp"%>

<html>
<head>
    <title>登录</title>
</head>
<body>
<h1 style="font-size: 50px;color: red">${msg}</h1>
<form action="${ctx}/SysUser/userlogin" method="post">
    <label>账号:</label> <input name="username" type="text"/>
    <label>密码:</label> <input name="password" type="password"/>
    <input type="submit" />
</form>


</body>
</html>
