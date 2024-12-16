package dev.kataray.javaconcepts.generics;

// A generic class to store any type of item (in this case, Fruits),
// and provide methods to add fruits and calculate total weight.

import java.util.ArrayList;
import java.util.List;

// bounded generics cuz im forcing it to be a type of fruit or subclass of fruit
public class AppBasket<T extends AppFruit> {
    private List<T> items;

    // Constructor to initialize an empty basket
    public AppBasket() {
        items = new ArrayList<>();
    }

    // Method to add a fruit to the basket
    public void addItem(T item) {
        items.add(item);
    }

    // Method to calculate the total weight of the fruits in the basket
    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (T item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    // Method to display the contents of the basket
    public void displayContents() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}
