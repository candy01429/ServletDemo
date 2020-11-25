package com.session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SessionTest1", urlPatterns = {"/SessionTest1"})
public class SessionTest1 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String param = (String) request.getAttribute("param"); // 由request取出參數值
        HttpSession session = request.getSession(); 
        session.setAttribute("msg1", " Hi" + param); // 將該字串以"msg1"鍵名儲存於HttpSession物件中
        /*
        setAttribute()儲存物件
        getAttribute()取出物件
        */
    }
}