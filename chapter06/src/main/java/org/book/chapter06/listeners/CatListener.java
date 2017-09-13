package org.book.chapter06.listeners;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;
import java.io.Serializable;

/**
 * Этот слушатель позволяет атрибуту отслеживать события,
 * которые могут быть важны для самого атрибута - например когда он добавляется или
 * удаляется из сессии, или сессия мигрирует на другую виртуальную машину.
 */

public class CatListener implements HttpSessionBindingListener,
        HttpSessionActivationListener, Serializable{

    private String breed;
    private int age;

    // Constructor
    public CatListener(String breed, int age) {
        this.breed = breed;
        this.age = age;
    }

    // Getters and Setters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Listener methods

    // Session binding events
    public void valueBound(HttpSessionBindingEvent event) {

    }

    public void valueUnbound(HttpSessionBindingEvent event) {

    }

    // Session activation events
    public void sessionWillPassivate(HttpSessionEvent se) {

    }

    public void sessionDidActivate(HttpSessionEvent se) {

    }
}
