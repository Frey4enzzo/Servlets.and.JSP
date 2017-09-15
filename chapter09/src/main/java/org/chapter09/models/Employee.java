package org.chapter09.models;

import java.util.ArrayList;
import java.util.List;

public class Employee {

    private String firstName;
    private String lastName;
    private int age;
    private Department department;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public static List<Employee> employees() {
        List<Employee> list = new ArrayList<>();

        Department dep1 = new Department(1L, "Руководители");
        Department dep2 = new Department(2L, "Бухгалтерия");
        Department dep3 = new Department(3L, "АСУ");

        Employee emp1 = new Employee();
        emp1.setFirstName("Алексей");
        emp1.setLastName("Ельников");
        emp1.setAge(30);
        emp1.setDepartment(dep3);

        Employee emp2 = new Employee();
        emp2.setFirstName("Джон");
        emp2.setLastName("Сноу");
        emp2.setAge(23);
        emp2.setDepartment(dep1);

        Employee emp3 = new Employee();
        emp3.setFirstName("Петир");
        emp3.setLastName("Бейлиш");
        emp3.setAge(38);
        emp3.setDepartment(dep2);

        Employee emp4 = new Employee();
        emp4.setFirstName("Тирион");
        emp4.setLastName("Ланнистер");
        emp4.setAge(32);
        emp4.setDepartment(dep2);

        Employee emp5 = new Employee();
        emp5.setFirstName("Серсея");
        emp5.setLastName("Ланнистер");
        emp5.setAge(35);
        emp5.setDepartment(dep1);

        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        list.add(emp5);
        return list;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", department=" + department +
                '}';
    }
}
