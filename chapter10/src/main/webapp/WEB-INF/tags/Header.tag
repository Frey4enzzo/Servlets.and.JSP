<%--
  Created by IntelliJ IDEA.
  User: Alexey
  Date: 15.09.2017
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<html>
<head>
    <title>Header</title>
</head>
<body>
<%-- rtexprvalue означает что параметр может быть строкой или выражением
    Параметр required означает, что при вызове тега этот параметр указывается ОБЯЗАТЕЛЬНО
 --%>
<%@attribute name="subTitle" required="true" rtexprvalue="true" %>

<img src="https://software.intel.com/sites/default/files/m/d/4/1/d/8/100111_100111.gif" alt="schema"> <br>

<em><strong>${subTitle}</strong></em>
</body>
</html>
