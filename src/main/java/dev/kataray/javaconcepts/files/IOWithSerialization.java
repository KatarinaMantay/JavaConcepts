package dev.kataray.javaconcepts.files;

import java.io.*;

public class IOWithSerialization implements Serializable {

    private String name;
    private int population;
    private double growthRate;

    public IOWithSerialization(){
        name = null;
        population = 0;
        growthRate = 0;
    }

    public IOWithSerialization(String initialName, int initialPopulation, double initialGrowthRate) {
        name = initialName;
        growthRate = initialGrowthRate;

        if (initialPopulation >= 0) {
            population = initialPopulation;
        } else {
            System.out.println("invalid population");
            System.exit(0);
        }
    }

    public String toString() {
        return ("name: " + name + "\npopulation: " + population + "\ngrowth rate: " + growthRate + "%");
    }

    public static void main(String[] args) {

        ObjectOutputStream outputStream = null;
        String fileName = "species.records";

        try {
            outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        } catch (IOException e) {
            System.out.println("error opening output file...");
            System.exit(0);
        }

        IOWithSerialization testA = new IOWithSerialization("wolf", 27, 0.02);
        IOWithSerialization testB = new IOWithSerialization("doggy", 100, 1.0);

        try {
            outputStream.writeObject(testA);
            outputStream.writeObject(testB);
            outputStream.close();
        } catch (IOException e) {
            System.out.println("error writing to file...");
            System.exit(0);
        }

        ObjectInputStream inputStream = null;
        try {
            inputStream = new ObjectInputStream(new FileInputStream("species.records"));
        } catch (IOException e) {
            System.out.println("error opening file...");
            System.exit(0);
        }

        IOWithSerialization readOne = null;
        IOWithSerialization readTwo = null;

        try {
            readOne = (IOWithSerialization) inputStream.readObject();
            readTwo = (IOWithSerialization) inputStream.readObject();
            inputStream.close();
        } catch (Exception e) {
            System.out.println("error reading from file...");
            System.exit(0);
        }

        System.out.println("following was read...\n");
        System.out.println(readOne + "\n");
        System.out.println(readTwo);
    }

}
