package dev.kataray.javaconcepts.files;

import java.io.*;

// This class implements the Serializable interface to allow its instances to be serialized and deserialized.
public class IOWithSerialization implements Serializable {

    // Instance variables that will be serialized
    private String name;
    private int population;
    private double growthRate;

    // Default constructor - initializes the instance variables to default values
    public IOWithSerialization(){
        name = null;
        population = 0;
        growthRate = 0;
    }

    // Constructor that initializes the object with the provided values
    public IOWithSerialization(String initialName, int initialPopulation, double initialGrowthRate) {
        name = initialName;
        growthRate = initialGrowthRate;

        // Validate population to ensure it's non-negative
        if (initialPopulation >= 0) {
            population = initialPopulation;
        } else {
            System.out.println("invalid population");
            System.exit(0); // Terminates the program if population is invalid
        }
    }

    // Override toString method to define how the object is represented as a string
    public String toString() {
        return ("name: " + name + "\npopulation: " + population + "\ngrowth rate: " + growthRate + "%");
    }

    // Main method where the serialization and deserialization take place
    public static void main(String[] args) {

        // Declare output stream for writing objects to a file
        ObjectOutputStream outputStream = null;
        String fileName = "species.records"; // Define file name for storing the serialized data

        // Attempt to create an ObjectOutputStream that writes to the specified file
        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        } catch (IOException e) {
            System.out.println("error opening output file...");
            System.exit(0); // If there's an error opening the file, terminate the program
        }

        // Create two instances of IOWithSerialization
        IOWithSerialization testA = new IOWithSerialization("wolf", 27, 0.02);
        IOWithSerialization testB = new IOWithSerialization("doggy", 100, 1.0);

        // Attempt to serialize the objects and write them to the file
        try {
            outputStream.writeObject(testA); // Write object testA to file
            outputStream.writeObject(testB); // Write object testB to file
            outputStream.close(); // Close the output stream after writing
        } catch (IOException e) {
            System.out.println("error writing to file...");
            System.exit(0); // If there's an error writing to the file, terminate the program
        }

        // Declare input stream for reading objects from the file
        ObjectInputStream inputStream = null;
        try {
            // Create an ObjectInputStream to read from the specified file
            inputStream = new ObjectInputStream(new FileInputStream("species.records"));
        } catch (IOException e) {
            System.out.println("error opening file...");
            System.exit(0); // If there's an error opening the file for reading, terminate the program
        }

        // Declare variables to hold the deserialized objects
        IOWithSerialization readOne = null;
        IOWithSerialization readTwo = null;

        // Attempt to read the serialized objects from the file
        try {
            readOne = (IOWithSerialization) inputStream.readObject(); // Read the first object
            readTwo = (IOWithSerialization) inputStream.readObject(); // Read the second object
            inputStream.close(); // Close the input stream after reading
        } catch (Exception e) {
            System.out.println("error reading from file...");
            System.exit(0); // If there's an error reading from the file, terminate the program
        }

        // Output the data that was read from the file
        System.out.println("following was read...\n");
        System.out.println(readOne + "\n"); // Print the first object
        System.out.println(readTwo); // Print the second object
    }
}
