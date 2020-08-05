<%--
  Created by IntelliJ IDEA.
  User: zjjt
  Date: 2020/7/25
  Time: 16:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>文件上传</title>
</head>
<body>

    <form action="upload" method="post" enctype="multipart/form-data">

        <input type="file" name="MultipartFile"/>
        <input type="submit"/>

    </form>

</body>
</html>
