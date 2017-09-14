package org.chapter08.ex1;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Example4 extends HttpServlet{


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Employee employee = new Employee();
        employee.setName("Алексей");
        Dog dog = new Dog();
        dog.setBreed("Джимм");
        Toy t1 = new Toy();
        t1.setName("Косточка");
        Toy t2 = new Toy();
        t2.setName("Мячик");
        Toy t3 = new Toy();
        t3.setName("Кукла");
        dog.setToys(new Toy[]{t1, t2, t3});
        employee.setDog(dog);

        request.setAttribute("employee", employee);
        getServletContext().getRequestDispatcher("/example4.jsp").forward(request, response);
    }
}
