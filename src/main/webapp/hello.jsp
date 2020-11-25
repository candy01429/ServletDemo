<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <!--由瀏覽器的URL後面輸入?參數名稱=參數值-->
            <!--http://localhost:8080/RWDCH2/hello.jsp?name=jim+Tzeng-->
            Hello,<%=request.getParameter("name")%>
        </h1>
    </body>
</html>
