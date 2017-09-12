package org.book.chapter05;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class SynchronizedTester extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.println("test context synchronized attributes");

        // потокобезопасное изменение атрибутов (context lock)
        // аттрибуты контекста защищены от изменения другими потоками
        synchronized (getServletContext()){
            getServletContext().setAttribute("foo", "22");
            getServletContext().setAttribute("bar", "42");
        }

        // Синхронизация на объекте сессии, обеспечивает безопасность аттрибутов сессии
        HttpSession session = req.getSession();
        synchronized (session){
            getServletContext().setAttribute("foo", "22");
            getServletContext().setAttribute("bar", "42");
        }

        printWriter.println(getServletContext().getAttribute("foo"));
        printWriter.println(getServletContext().getAttribute("bar"));
    }
}
