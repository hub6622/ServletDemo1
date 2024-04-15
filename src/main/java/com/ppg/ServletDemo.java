package com.ppg;

import javax.jws.WebService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/demo1")
public class ServletDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("收到请求");
        String myheader = req.getHeader("myheader");
        Cookie cookie = new Cookie("name","lhh");
        resp.addCookie(cookie);
        String str2 = req.getParameter("name");
        System.out.println(str2);
        System.out.println(myheader);
        HttpSession session = req.getSession();
        resp.getWriter().write("hello!!!!");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
