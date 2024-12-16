package dev.kataray.javaconcepts.generics;

public class FruitBasketApp {

    public static void main(String[] args) {
        // Create some fruits
        AppFruit apple = new AppFruit("Apple", 0.2);    // Apple weighs 0.2 kg
        AppFruit banana = new AppFruit("Banana", 0.25);  // Banana weighs 0.25 kg
        AppFruit orange = new AppFruit("Orange", 0.3);   // Orange weighs 0.3 kg

        // Create a Basket to store fruits (Fruit is the type of items in the basket)
        AppBasket<AppFruit> fruitBasket = new AppBasket<>();

        int a = 6;

        // Add fruits to the basket
        fruitBasket.addItem(apple);
        fruitBasket.addItem(banana);
        fruitBasket.addItem(orange);
        //fruitBasket.addItem(a); NOTE WILL NOT WORK CUZ NOT TYPE FRUIT ! ! !

        // Display contents of the basket
        System.out.println("Contents of the fruit basket:");
        fruitBasket.displayContents();

        // Calculate and display the total weight of the basket
        double totalWeight = fruitBasket.calculateTotalWeight();
        System.out.println("\nTotal weight of fruits in the basket: " + totalWeight + " kg");
    }
}

