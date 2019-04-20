<%--
  Created by IntelliJ IDEA.
  User: tranchung
  Date: 20/04/2019
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Currency Conversion</title>
</head>
<body>
<form method="post">
    <h1>Currency Conversion</h1>
    <fieldset>
        <legend>Currency Conversion</legend>
        <table>
            <tr>
                <td>Rate :</td>
                <td><input type="text" name="rate" value="23000"></td>
            </tr>
            <tr>
                <td>USD :</td>
                <td><input type="text" name="usd"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Convert"></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
