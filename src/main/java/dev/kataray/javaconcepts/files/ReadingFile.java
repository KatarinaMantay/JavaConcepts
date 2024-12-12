package dev.kataray.javaconcepts.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFile {

    public static void main(String[] args) {

        // the file you want to read from
        // NOTE: you can also read from kb --> String fileName = keyboard.next ();
        // NOTE: (USING FILE OBJ) --> File file = new File("out.txt");
        String fileName = "out.txt";
        Scanner inputStream = null;

        // NOTE: (USING FILE OBJ) -->  System.out.println("The file " + file.getName() + " contains...");
        System.out.println("The file " + fileName + " contains...");

        // surround with try/catch in-case we cant find file
        try {
            // to get input from file, need the new File(fileName) part !!
            // NOTE (USING FILE OBJ) --> inputStream = new Scanner(file);
            inputStream = new Scanner(new File(fileName));

        } catch (FileNotFoundException e) {

            // if file not found, print error and exit
            System.out.println("Error opening file");
            System.exit(0);
        }

        // reads and print the contents of file
        while (inputStream.hasNextLine()) {
            String line = inputStream.nextLine();
            System.out.println(line);
        }

        inputStream.close();
    }
}

/*
NOTES:

    you can also...
    inputStream.hasNextLine()
    inputStream.hasNextInt()
    inputStream.hasNextDouble()
    inputStream.hasNext()

    -----

    File can also be used -- SEE: (USING FILE OBJ)
    new File (aFileHere.txt) is not a STRING, it's an OBJECT supposed to name a file
    some methods:
        canRead() --> can program read from file
        canWrite() --> can program write to the file
        delete() --> returns true if was able to delete
        exists() --> tests whether obj was created
        getName() --> returns name of file (not path)
        length() --> returns length of file (in bytes)

    -----

    can also define a METHOD to open a stream:

    public static PrintWriter openOutputTextFile(String fileName) throws FileNotFoundException, IOException{
        PrintWriter toFile = new PrintWriter(fileName);
        return toFile;
   }

 */
