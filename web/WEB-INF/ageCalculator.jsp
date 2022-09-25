<%-- 
    Document   : ageCalculator
    Created on : 24-Sep-2022, 4:02:41 PM
    Author     : manav
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form action="age" method="post">
            Enter your age: 
            <input type="text" name="age"><br>
            <input type="submit" name="Age next birthday" value="Age next birthday">
        </form>
            <a>${message}</a><br>
            <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>