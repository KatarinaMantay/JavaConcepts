package dev.kataray.javaconcepts.files;

import java.io.*;

public class ReadingToBinaryFile {
    public static void main(String[] args) {

        // Define the file name where the binary data will be read from
        String fileName = "numbers.dat";

        try {
            // Create an ObjectInputStream that reads from the specified file
            ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName));
            System.out.println("Reading from file...");

            // Continuously read integers from the file until the end
            while (true) {
                try {
                    // Read an integer from the binary file
                    int anInteger = inputStream.readInt();
                    // Print the read integer to the console
                    System.out.println(anInteger);
                } catch (EOFException e) {
                    // If end of file is reached, catch the EOFException
                    System.out.println("end reached");
                    break;  // Break the loop once the end is reached
                }
            }
            // Close the input stream after reading is complete
            inputStream.close();

        } catch (EOFException | FileNotFoundException e) {
            // Catch exception if the file is not found or end of file is reached
            System.out.println("End of file reached");
        } catch (IOException e) {
            // Catch any IO exceptions that might occur during file reading
            System.out.println("problem reading from file");
        }
    }
}
