package org.book.chapter05;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ListenerTester extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("test context attributes set by listener<br>");
        out.println("<br>");

        // получаем объект собаки, созднный при инициализации ServletContext
        // метод getAttribute возвращает тип Object, поэтому необходимо явное приведение к типу Dog
        Dog dog = (Dog) getServletContext().getAttribute("dog");

        out.println("Dog's breed is: " + dog.getBreed());
    }
}
