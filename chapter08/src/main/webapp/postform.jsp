<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Action Form</title>
</head>
<body>
    <p>
    <form method="post" action="Postform.do">
        Name: <input type="text" name="name"> </br>
        ID#:  <input type="text" name="empID"> </br>
        </br>
        First food:  <input type="text" name="food"> </br>
        Second food: <input type="text" name="food"> </br>
        </br>
        <input type="submit" name="Отправить">
    </form>
    </p>
    <p>
        Request param name is: ${param.name} <br>
        Request param empID is: ${param.empID} <br>
        <br>
        Request param food is: ${param.food} <br>
        First food request param: ${paramValues.food[0]} <br>
        Second food request param: ${paramValues.food[1]} <br>
        <br>
        Request param name: ${paramValues.name[0]}
    </p>
</body>
</html>
