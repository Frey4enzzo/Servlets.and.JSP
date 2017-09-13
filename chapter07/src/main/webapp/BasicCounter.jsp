<%@ page import="org.book.chapter07.*,java.util.*" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>JSP Test Page</h1>
<p> Scriptlet code counter
<% out.println(Counter.getCount());%>
</p>
<p> Expression code counter
    <%= Counter.getCount()%>
</p>
<p> JSP code counter
    <%! int count = 0; %>
    <%= count++ %>
</p>
<p> JSP Double counter
    <%! int doubleCount() {
            int dcount = count*2;
            return dcount;
    }
    %>
    <%= doubleCount() %>
</p>
<%= 5 > 3%>
<%= "27" %>
<%= Math.random() %>
<%=  new String[3]%>
<%= false %>
<%= new Counter() %>
</body>
</html>
