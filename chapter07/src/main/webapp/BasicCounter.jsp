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
<p> Session ID
    <%= request.getRequestedSessionId()%>
</p>
<p> ArrayList 0 index
    <% ArrayList<String> list = new ArrayList<>();
            list.add(new String("Alexey"));%>
    <%=list.get(0)%>
</p>
<p><a href="HobbyPage.jsp">HobbyPage</a></p>
<p><a href="TestInit.jsp">Test JSP Initialization</a></p>
<p> Expression tests
<%= 5 > 3%>
<%= "27" %>
<%= Math.random() %>
<%=  new String[3]%>
<%= false %>
<%= new Counter() %>
</p>
</body>
</html>
