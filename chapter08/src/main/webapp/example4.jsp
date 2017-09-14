<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Example 4</title>
</head>
<body>
<p>
    ${employee.name}'s dog ${employee.dog.breed} toys are: </br>
    ${employee.dog.toys[0].name},${employee.dog.toys[1].name}, and ${employee.dog.toys[2].name}
</p>
Совет дня
<div class="tipBox">
    <b>Tip of the Day: </b> <br/> <br/>
    ${pageContent.currentTip} </br>

</div>
</body>
</html>
