<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<!--taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core-->
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Duke's Soccer League:Add a New League</title>
    </head>
    <body bgcolor='white'>
        <form action="/ServletDemo/AddLeague" method="GET">
            Year: <input type='text' name='year' /><br /><br />
            Season:
            <select name='season'>
                <option value='UNKNOWN'>select...</option>
                <option value='Spring'>Spring</option>
                <option value='Summer'>Summer</option>
                <option value='Fall'>Fall</option>
                <option value='Winter'>Winter</option>
            </select><br /><br />
            Title:<input type='text' name='title' /><br /><br />
            <input type='submit' value='Add League' /><br /><br />
        </form>
    </body>
</html>
