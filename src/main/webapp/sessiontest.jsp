<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Session Test</title>
    </head>
    <body>
        <h1>
            <%=request.getSession().getAttribute("msg2")%>
        </h1>
    </body>
</html>
