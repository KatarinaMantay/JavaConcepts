package dev.kataray.javaconcepts.files;

import java.io.*;

public class ReadingToBinaryFile {
    public static void main(String[] args) {

        String fileName = "numbers.dat";

        try {
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            System.out.println("Reading from file...");

            while (true) {
                try {
                    int anInteger = inputStream.readInt();
                    System.out.println(anInteger);
                } catch (EOFException e) {
                    System.out.println("end reached");
                    break;
                }
            }
            inputStream.close();

        } catch (EOFException | FileNotFoundException e) {
            System.out.println("End of file reached");
        } catch (IOException e) {
            System.out.println("problem reading from file");
        }
    }
}
