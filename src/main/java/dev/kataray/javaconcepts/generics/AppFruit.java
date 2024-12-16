package dev.kataray.javaconcepts.generics;

// A simple class representing a Fruit, which has a name and a weight.

public class AppFruit {
    private String name;
    private double weight; // Weight in kilograms

    // Constructor to initialize a fruit with a name and weight
    public AppFruit(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Getter for the weight
    public double getWeight() {
        return weight;
    }

    // Overriding toString to display the fruit's details
    @Override
    public String toString() {
        return name + " (" + weight + " kg)";
    }
}
