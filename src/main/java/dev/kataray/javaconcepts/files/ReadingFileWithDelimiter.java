package dev.kataray.javaconcepts.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFileWithDelimiter {
    public static void main(String[] args) {

        //file we want to look at
        String fileName = "coder.txt";

        try {
            Scanner inputStream = new Scanner(new File(fileName));

            while(inputStream.hasNextLine()){
                String line = inputStream.nextLine();

                // this is the delimiter you choose
                // we store the seperated line into an array to manage it
                String[] array = line.split(",");

                // assigning our array indexes to variables
                String name = array[0];
                int age = Integer.parseInt(array[1]);
                String nickName = array[2];

                System.out.println(name + " is " + age + " and their nickname is " + nickName);
            }

            inputStream.close();

        } catch (FileNotFoundException e) {
            System.out.println("Cant find file!");
            System.exit(0);
        }
    }
}
