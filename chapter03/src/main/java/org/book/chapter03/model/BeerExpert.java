package org.book.chapter03.model;


import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();

        if (color.equals("light")) brands.add("Tuborg");
        else if (color.equals("amber")) brands.add("Hasselhoff");
        else if (color.equals("dark")) brands.add("Bud");
        else if (color.equals("brown")) brands.add("Guiness");
        return brands;
    }
}
