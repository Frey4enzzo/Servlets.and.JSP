package org.chapter09.ex1;

import org.chapter09.models.Employee;

import java.util.List;

/**
 * Created by Alexey on 15.09.2017.
 */
public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Employee.employees();

        employees.stream().forEach(employee -> System.out.println(employee));
    }
}
