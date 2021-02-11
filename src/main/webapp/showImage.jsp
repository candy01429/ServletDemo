
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>showImage</title>
    </head>
    <body>
        <table border="1">
            <tr>
                <th>images</th>
            </tr>
            <tr>
                <!--直接指定相對位置-->
                <td><img src="/ServletDemo/images/cat.jpg" /></td>
            </tr>
            <tr>
                <!--使用servlet輸出特定圖片-->
                <td><img src="/ServletDemo/showImage" /></td>
            </tr>
        </table>
    </body>
</html>
