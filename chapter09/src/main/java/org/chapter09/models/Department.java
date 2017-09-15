package org.chapter09.models;


import java.util.ArrayList;
import java.util.List;

public class Department {

    private Long id;
    private String name;

    public Department() {
    }

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static List<Department> departments() {
        List<Department> list = new ArrayList<>();
        Department dep1 = new Department(1L, "Руководители");
        Department dep2 = new Department(1L, "Бухгалтерия");
        Department dep3 = new Department(1L, "АСУ");

        list.add(dep1);
        list.add(dep2);
        list.add(dep3);

        return list;
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
