package dev.kataray.javaconcepts.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class WritingToBinaryFile {
    public static void main(String[] args) {

        //dat is a binary file which stores data in binary format (0s and 1s)
        String fileName = "numbers.dat";

        try {

            // handles output to the binary file (keep note of ObjectOutputStream rather than PrintWriter)
            // NOTE: ObjectOutputStream cannot take a STRING (FileOutputStream can)
            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter non-negative nums: ");
            System.out.println("place negative number at end...");

            int anInteger = 1;

            while (anInteger >= 0) {
                anInteger = scanner.nextInt();
                outputStream.writeInt(anInteger);
            }

            outputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("Problem opening file...");
        } catch (IOException e) {
            System.out.println("Problem with output to file...");
        }
    }
}

/*
NOTES:

    to use File Object:
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(new File(fileName));

    by file name:
    ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName));

    -----
    some methods:
    writeInt() --> writes int value to output stream
    writeChar(int c) throws IOException --> auto converts to int and writes
    writeUTF(String string) throws IOException --> writes string to output (Unicode Text Format)


 */
