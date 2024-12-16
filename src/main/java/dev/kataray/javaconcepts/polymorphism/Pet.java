package dev.kataray.javaconcepts.polymorphism;

public class Pet {
    String name;
    int age;
    int year;

    public Pet(String name, int age, int year){
        this.name = name;
        this.age = age;
        this.year = year;
    }

    public Pet(){
        this.name = "no name yet";
        this.age = 0;
        this.year = 0;
    }

    public void setName(String newName){
        name = newName;
    }
    public String getName(){
        return name;
    }

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
