<%--
  Created by IntelliJ IDEA.
  User: Egor
  Date: 30.06.2021
  Time: 0:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title> Java File Upload Servlet Example </title>
</head>
<body>

<form method="post" action="/uploadservlet" enctype="multipart/form-data">
  <input type="file" name="file" multiple/>
  <input type="submit" value="Upload" />
</form>

</body>
</html>
