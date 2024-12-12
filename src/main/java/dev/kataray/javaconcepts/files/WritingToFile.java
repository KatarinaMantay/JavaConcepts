package dev.kataray.javaconcepts.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class WritingToFile {

    public static void main(String[] args) {

        //to specify a folder use absolute path
        //String folderPath = " (absolute path here) ";

        // the name of the file you want to find/create/modify
        String fileName = "out.txt";

        // PrintWriter is the class needed for writing to a file
        // also necessary to use a try/catch in-case filepath doesn't exist
        try (PrintWriter outputStream = new PrintWriter(new FileOutputStream(fileName, true))) {
            System.out.println("Enter 3 lines of text: ");
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < 3; i++) {
                String line = scanner.nextLine();
                outputStream.println(i + " " + line);
            }

            System.out.println("Text has been written to " + fileName);
        } catch (FileNotFoundException e) { //catches error if file not found
            System.out.println("Error opening " + fileName);
            System.exit(0);
        }
    }
}

/*
NOTES:
    can also define a METHOD to open a stream:
    EX code -->
    public static PrintWriter openOutputTextFile(String fileName) throws FileNotFoundException, IOException{
        PrintWriter toFile = new PrintWriter(fileName);
        return toFile;
   }

   EX call -->
   PrintWriter outputStream = null;
   try {
    outputStream = openOutputTextFile("data.txt");
   } (catch block here)


 */