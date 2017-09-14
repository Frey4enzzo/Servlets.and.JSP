package org.chapter08.ex1;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Example3 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<String> nums = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            nums.add(String.valueOf(i));
        }

        String[] favoriteMusic = {"Trance", "Progressive", "Vocal Trance", "Neurofunk", "Pop"};

        request.setAttribute("numbers", nums);
        request.setAttribute("musicList", favoriteMusic);

        getServletContext().getRequestDispatcher("/example1.jsp").forward(request,response);
    }
}
