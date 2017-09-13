package org.book.chapter06.listeners;

import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * Этот слушатель оповещает о событиях, когда аттрибуты добавляются
 * или удаляются из сессии. Необходимо добавить в DD
 */

public class BeerAttributeListener implements HttpSessionAttributeListener{

    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        // Получаем имя и значение добавляемого аттрибута
        String name = event.getName();
        Object value = event.getValue();

        System.out.println("Аттрибут добавлен к сессии: " + name + " " + value);
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
        String name = event.getName();
        Object value = event.getValue();

        System.out.println("Аттрибут удален из сессии: " + name + " " + value);
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
        String name = event.getName();
        Object value = event.getValue();

        System.out.println("Аттрибут перемещен: " + name + " " + value);
    }
}
