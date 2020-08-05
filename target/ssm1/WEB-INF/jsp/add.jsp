<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/7/24
  Time: 21:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="hade.jsp"%>
<html>
<head>
    <title>add</title>
</head>
<body>

<h1>我是Add</h1>
<br>
<br>

<h1>新闻增加</h1>

${msg}
<s:form action="${ctx}/add" method="post" modelAttribute="news">

    新闻编号:<s:input path="newsId"></s:input>
    新闻标题:<s:textarea path="title"></s:textarea><s:errors path="title"/>
    <input type="submit" />

</s:form>


</body>
</html>
