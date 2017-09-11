package org.book.chapter05;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

/**
 * Реализуя интерфейс HttpSessionBindingListener экземпляр класса
 * будет знать больше о своей роли в приложении, а точнее, когда объект
 * добавляется к сессии или удаляется из сессии
 */

public class Dog implements HttpSessionBindingListener{

    String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent event) {
        // код метода выполняется когда объект добавляется к сессии
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent event) {
        // код объекта выполняется, когда объект удаляется из сессии
    }
}
