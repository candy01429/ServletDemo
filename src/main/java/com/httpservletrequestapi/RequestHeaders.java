package com.httpservletrequestapi;

import java.io.IOException;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RequestHeaders")
public class RequestHeaders extends HttpServlet { // 顯示所有HttpServletRequest物件的所有headers

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StringBuilder sb = new StringBuilder();
        Enumeration<String> headerNames = request.getHeaderNames(); // 取得所有Header的名稱
        while (headerNames.hasMoreElements()) {
            String key = headerNames.nextElement();
            String value = request.getHeader(key); // 取得特定Header的內容
            sb.append(key + " = " + value + "<br />");
        }
        response.getWriter().append(sb.toString());
    }
}
