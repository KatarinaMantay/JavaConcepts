package dev.kataray.javaconcepts.inheritance;

// Superclass (Parent Class)
class Animal {
    // Fields (attributes) shared by all animals
    String name;
    int age;

    // Constructor to initialize the Animal object
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to make a sound (common for all animals)
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    // Method to describe the animal
    public void describe() {
        System.out.println(name + " is " + age + " years old.");
    }
}

// Subclass (Child Class) that inherits from Animal
class Dog extends Animal {
    // Additional field specific to Dog
    String breed;

    // Constructor for Dog, calling the superclass constructor to initialize common fields
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call to Animal's constructor
        this.breed = breed;
    }

    // Overriding the makeSound method (polymorphism)
    @Override
    public void makeSound() {
        System.out.println(name + " says: Woof!");
    }

    // Additional method specific to Dog
    public void fetch() {
        System.out.println(name + " is fetching the ball!");
    }
}

// Another subclass (Child Class) that inherits from Animal
class Cat extends Animal {
    // Additional field specific to Cat
    String color;

    // Constructor for Cat, calling the superclass constructor to initialize common fields
    public Cat(String name, int age, String color) {
        super(name, age);  // Call to Animal's constructor
        this.color = color;
    }

    // Overriding the makeSound method (polymorphism)
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow!");
    }

    // Additional method specific to Cat
    public void scratch() {
        System.out.println(name + " is scratching the post!");
    }
}

// Main class to test inheritance
public class inheritanceEx {
    public static void main(String[] args) {
        // Create a Dog object
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.describe();  // Inherited from Animal
        dog.makeSound(); // Overridden in Dog
        dog.fetch();     // Specific to Dog

        System.out.println();  // New line for separation

        // Create a Cat object
        Cat cat = new Cat("Whiskers", 2, "Black");
        cat.describe();  // Inherited from Animal
        cat.makeSound(); // Overridden in Cat
        cat.scratch();   // Specific to Cat
    }
}
