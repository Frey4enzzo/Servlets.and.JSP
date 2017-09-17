<%-- Используем tagdir аттрибут в taglib инструкции чтобы получить доступ к директории тегов--%>
<%@taglib prefix="myTags" tagdir="/WEB-INF/tags" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Example1</title>
</head>
<body>
    <h2>Chapter 10 Taglib and Tags</h2>
    <%-- Имя тага просто имя нашей JSP страницы--%>
    <myTags:example1 fontColor="#660099">Lorem ipsum dolor sit amet, consectetur adipisicing elit.
        Asperiores eos minima non nulla placeat, possimus praesentium quia quo ratione sunt.</myTags:example1>
    
    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Explicabo, quis!</p>
        <p>Contact us ${initParam.adminEmail}</p>
</body>
</html>
