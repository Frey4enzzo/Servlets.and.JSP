<%@ page import="java.util.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>

<html>
<body>
<h1 align="center">Beer Recommendations JSP</h1>
<p></p>
<%
    List<String> styles = (ArrayList)request.getAttribute("styles");
    Iterator it = styles.iterator();
    while (it.hasNext()) out.print("<br>try: " + it.next());
%>
</body>
</html>
