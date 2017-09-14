package org.chapter08.ex1;


import java.util.Arrays;

public class Dog {

    private String breed;
    private Toy[] toys;


    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Toy[] getToys() {
        return toys;
    }

    public void setToys(Toy[] toys) {
        this.toys = toys;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", toys=" + Arrays.toString(toys) +
                '}';
    }
}
