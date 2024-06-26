package com.ppg;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/hello2")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("收到GET请求");
        HttpSession session=req.getSession();
        String name = (String) session.getAttribute("name");
        if(name == null || name.equals("")){
            session.setAttribute("name","leo");
        }
        System.out.println("本次操作是："+name);
        System.out.println("本次请求的session的ID是："+session.getId());
        session.setMaxInactiveInterval(15);


    }
}
