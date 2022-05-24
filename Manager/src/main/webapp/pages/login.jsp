<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/user/checkUser4" method="post">
    username:<input name="uname" type="text"/><br/>
    password:<input name="password" type="password"/><br/>
    gender:<input name="gender" type="radio" value="male" checked/>male
    <input name="gender" type="radio" value="female"/>female<br/>
    hobbies:<input name="hobbies" type="checkbox" value="music"/>music
    <input name="hobbies" type="checkbox" value="football"/>football
    <input name="hobbies" type="checkbox" value="swimming"/>swimming<br/>
    departments:<select name="department">
        <option value="d1">department1</option>
        <option value="d2">department2</option>
        <option value="d3">department3</option>
    </select><br/>
    age:<input name="age" type="text"/><br/>
    introduction:<br/><textarea name="introduction" rows="10" cols="20"></textarea><br/>
    <input value="Login" type="submit"/>
</form>
<a href="/user/checkUser3/aa/123/10" target="_blank">pathvariable</a>
</body>
</html>
