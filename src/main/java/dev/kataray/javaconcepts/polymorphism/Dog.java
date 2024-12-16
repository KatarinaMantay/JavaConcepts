package dev.kataray.javaconcepts.polymorphism;

public class Dog extends Pet{
    String breed;

    public Dog(String name, int age, int year, String breed){
        super(name, age, year);
        this.breed = breed;
    }

    @Override
    void makeSound() {
        System.out.println("Woof Woof!");
    }
}
