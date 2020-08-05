<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/7/24
  Time: 21:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="hade.jsp"%>
<html>
<head>
    <title>首页</title>
</head>
<body>

<h1>我是首页</h1>
${hhh}<br/>
${msg}

<br/><hr/>
<a href="${ctx}/toupload">文件上传</a>
<br/>

<img src="images/波多野结衣.jpg">
<shiro:hasRole name="高级用户">

    <h1>  高级用户可见</h1>

</shiro:hasRole>

<shiro:hasRole name="管理员">

    <h1>管理员可见</h1>

</shiro:hasRole>

<shiro:hasPermission name="bookmanager:book:update">

    您拥有book的add权限
    <a href="${ctx}/Test/toAdd"> 去Add </a>

</shiro:hasPermission>


<shiro:guest>无需权限</shiro:guest>


<%--<a href="language"><t:message code="language"></t:message></a>--%>
<%--<t:message code="yhzh.label"/><input type="text"/>--%>
<%--<t:message code="yhmm.label"/><input type="password"/>--%>


</body>
</html>
