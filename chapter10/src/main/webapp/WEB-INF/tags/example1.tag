<%@attribute name="fontColor" required="true" %>
<%@tag body-content="tagdependent" %>

<em><strong><font color="${fontColor}">
    <%-- jsp:doBody означает, что тег будет применяться ко всему, что будет находится
         между его тегами в вызываемом файле --%>
    <jsp:doBody/>
</font></strong></em>
