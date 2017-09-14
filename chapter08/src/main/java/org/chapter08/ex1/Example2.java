package org.chapter08.ex1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Example2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Employee emp = new Employee();
        Address address = new Address();
        Dog dog = new Dog();
        dog.setBreed("Джимм");
        emp.setId(15);
        emp.setName("Алексей");
        emp.setAddress(address);
        emp.setDog(dog);
        address.setAddress("Звездный городок");

        String[] musicTracks = {"Служу России", "Осень", "Faster, Better, Stronger"};
        List<String> foodlist = new ArrayList<>();
        foodlist.add("Яблочко");
        foodlist.add("Колбаска");
        foodlist.add("Яички");
        foodlist.add("Хлебушек");
        Map<String, String> musicmap = new HashMap<>();
        musicmap.put("Ambient", "Zero 7");
        musicmap.put("Rap", "Guf");
        musicmap.put("Trance", "Armin van Buuren");

        req.setAttribute("emp", emp);
        req.setAttribute("tracklist", musicTracks);
        req.setAttribute("foodlist", foodlist);
        req.setAttribute("musicmap", musicmap);

        getServletContext().getRequestDispatcher("/example1.jsp").forward(req, resp);
    }
}
