package org.book.chapter06.listeners;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Этот слушатель поможет узнать количество активных сессий приложения.
 * Его необходимо прописать в DD
 */

public class BeerSessionCounter implements HttpSessionListener{

    static private int activeSessions;

    public static int getActiveSessions() {
        return activeSessions;
    }

    @Override
    public void sessionCreated(HttpSessionEvent event) {
        activeSessions++;
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent event) {
        activeSessions--;
    }
}
