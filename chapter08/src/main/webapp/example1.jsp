<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Example 1</title>
</head>
<body>
<h2>Example 1 page</h2>

<p>
    Emp name: ${emp.name} </br>
    Emp address: ${emp.address.address} </br>
    Emp dog breed: ${emp.dog.breed} </br>
</p>
<br>Music Tracks </br>
Track 1: ${tracklist[0]} </br>
Track 2: ${tracklist["1"]} </br>
Track 3: ${tracklist[2]} </br>
</p>
<p>Foodlist </br>
    ${foodlist}
</p>
<p>Music Map</br>
    Trance is: ${musicmap.Trance} </br>
    Rap is: ${musicmap["Rap"]}
</p>
<p><strong>Dispatch from Example3.do </strong></br>
    musicList[numbers[0]] = ${musicList[numbers[0]]} </br>
    musicList[numbers[0]+1] = ${musicList[numbers[0]+1]} </br>
    musicList[numbers["2"]] = ${musicList[numbers["2"]]} </br>
    musicList[numbers[numbers[1]]] = ${musicList[numbers[numbers[1]]]}
</p>
<p>
HOST: ${header["host"]}</p>
Cookie: ${cookie.JSESSIONID.value}
</body>
</html>
