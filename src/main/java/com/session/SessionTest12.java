package com.session;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "SessionTest2", urlPatterns = {"/SessionTest2"})
public class SessionTest12 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String msg1 = (String) session.getAttribute("msg1"); // 由req取出參數值
        session.setAttribute("msg2", msg1 + " Hi"); // 將該字串以"msg2"鍵名儲存於HttpSession物件中
        RequestDispatcher rd = request.getRequestDispatcher("sessiontest.jsp");
        rd.forward(request,response);
    }
}
