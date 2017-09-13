package org.book.chapter06;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class URLRewritingTester extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();


        writer.println("<html><body>");
        writer.println("<a href=\\" + resp.encodeURL("/SelectBeer.do") + "\\>click me</a>");
        writer.println("</body></html>");


    }
}
