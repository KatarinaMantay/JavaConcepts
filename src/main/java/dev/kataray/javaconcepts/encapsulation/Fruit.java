package dev.kataray.javaconcepts.encapsulation;

public class Fruit {
    private boolean ripe;

    public Fruit(boolean ripe) {
        this.ripe = ripe;
    }

    public boolean isRipe() {
        return ripe;
    }

    public void setRipe(boolean ripe) {
        this.ripe = ripe;
    }

    public void printFruit() {
        System.out.println(getClass().getSimpleName());
    }
}
