<%@ page isErrorPage="true" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
It's Error Page <br>
<img src="http://weneedfun.com/wp-content/uploads/2016/08/Facepalm-Memes-1.png" alt="error"> <br>
Причина ошибки: ${pageContext.exception} on the Server
</body>
</html>
