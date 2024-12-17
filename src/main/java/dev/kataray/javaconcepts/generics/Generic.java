package dev.kataray.javaconcepts.generics;

import java.util.ArrayList;

public class Generic <T> {
    ArrayList<T> list = null;

    public Generic() {
        list = new ArrayList<>();
    }

    public void listContents() {
        System.out.println("contents are...");

        for(T item : list) {
            System.out.println(item);
        }
    }

    public void addToList(T num) {
        list.add(num);
    }
}
