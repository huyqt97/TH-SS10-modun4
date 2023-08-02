<%--
  Created by IntelliJ IDEA.
  User: test
  Date: 02/08/2023
  Time: 10:47 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<h1>Edit new Student</h1>
<form action="/home-servlet" method="post">
  <input type = "hidden" name = "action" value="EDIT">
  <input type = "hidden" name="id" value = "${data.id}">id = "${data.id}"  >
  <label for="name">Name </label>
  <input type="text" id="name" name="name" value= "${data.name}">
  <label for="age">Age</label>
  <input type="number" min="0" id="age" name="age"value= "${data.age}">
  <input type="submit" value="EDIT" name="action"/>
</form>
</body>
</html>
