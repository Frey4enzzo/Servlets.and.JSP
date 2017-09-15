package org.chapter09.ex1;

import org.chapter09.models.Department;
import org.chapter09.models.Employee;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * В этом сервлете просто добавляем пару атрибутов (список Employee и Department)к запросу
 * для того чтобы использовать их в EL на странице example1.jsp
 */

public class Example1 extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // создаем списки сотрудников и отделов с помощью статических методов классов
        List<Employee> employees = Employee.employees();
        List<Department> departments = Department.departments();

        // добавляем аттрибуты к реквесту
        request.setAttribute("employees", employees);
        request.setAttribute("departments", departments);

        // отправляем на страницу example1.jsp
        request.getRequestDispatcher("resources/pages/example1.jsp").forward(request, response);
    }
}
