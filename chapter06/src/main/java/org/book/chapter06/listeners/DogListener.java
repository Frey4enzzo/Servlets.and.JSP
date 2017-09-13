package org.book.chapter06.listeners;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * HttpSessionBindingListener слушатель создания и уничтожения АТТРИБУТОВ сессии.
 * Этого слушать не надо регистрировать в DD
 */

public class DogListener implements HttpSessionBindingListener{

    private String breed;

    public DogListener(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {

    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {

    }
}
