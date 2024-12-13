package dev.kataray.javaconcepts.polymorphism;

public class Main {
    public static void main(String[] args) {

        Pet pet = new Pet("sparky", 10, 2005);
        System.out.println(pet.getName());
        pet.setName("dingdong");
        System.out.println(pet.getName());

        Pet dog = new Dog("barky", 10, 2004, "poodle");
        Dog doggy = new Dog("stinker", 9, 2004, "poodle");
        dog.setName("woofy");
        System.out.println(dog.getName());
    }
}