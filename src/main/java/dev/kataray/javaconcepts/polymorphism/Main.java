package dev.kataray.javaconcepts.polymorphism;

public class Main {
    public static void main(String[] args) {

        // polymorphism here is how i am making a dog of type PET
        // by doing this, i can call pets methods and such, however if i overide methods in my
        // DOG class then those are the ones that will be called...
        Dog dog = new Dog("barky", 10, 2004, "poodle");
        Pet somePet = new Pet("stinker", 9, 2004);
        dog.setName("woofy");
        System.out.println(dog.getName());

        // for example, dog.makeSound() since overiden in Dog class, will output woof woof
        dog.makeSound();
        somePet.makeSound();
    }
}