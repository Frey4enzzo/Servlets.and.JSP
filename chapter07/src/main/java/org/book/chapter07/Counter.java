package org.book.chapter07;

/**
 * Счетчик посещения страниц
 */

public class Counter {

    private static int count;

    public static synchronized int getCount(){
        count++;
        return count;
    }
}
