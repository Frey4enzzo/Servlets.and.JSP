<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Example1</title>
</head>
<body>
    <p>
        <ul>
            <li>Employee 1: ${employees[0].firstName} ${employees[0].lastName}, отдел - ${employees[0].department.name} <br></li>
            <li>Employee 2: ${employees[1].firstName} ${employees[1].lastName}, отдел - ${employees[1].department.name} <br></li>
            <li>Employee 3: ${employees[2].firstName} ${employees[2].lastName}, отдел - ${employees[2].department.name} <br></li>
            <li>Employee 4: ${employees[3].firstName} ${employees[3].lastName}, отдел - ${employees[3].department.name} <br></li>
            <li>Employee 5: ${employees[4].firstName} ${employees[4].lastName}, отдел - ${employees[4].department.name} <br></li>
        </ul>
    </p>
    <p> Пример использования значения по умолчанию, если выражение null <br>
        <c:out value="${employees[0].firstName}" default="guest"/>
    </p>
    <p> <strong>Пример использования JSTL тега forEach для массивов и списков </strong><br>
        <table>
            <c:forEach var="employee" items="${employees}" >
                <tr>
                    <td>${employee.firstName}</td>
                    <td>${employee.lastName}</td>
                    <td>${employee.department.name}</td>
                </tr>
            </c:forEach>
        </table>
    </p>
</body>
</html>
