package dev.kataray.javaconcepts.objects;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

    // this is how you instantiate an arrayList
    private ArrayList<String> toDoList = new ArrayList<>();
    private boolean done = false;

    public void run() {
        Scanner scanner = new Scanner(System.in);

        while (!done) {
            System.out.println("Please enter a phrase: ");
            String input = scanner.nextLine();
            //example of adding to an arrayList
            toDoList.add(input);

            System.out.println("exit? Y/N");
            String exit = scanner.nextLine();
            if (exit.equalsIgnoreCase("Y")) {
                done = true;
            }
        }

        // printing out an arrayList
        System.out.println("Your to-do list:");
        for (String item : toDoList) {
            System.out.println(item);
        }

        // another way you can do this...
//        for(int i = 0; i < toDoList.size(); i++) {
//            String item = toDoList.get(i);
//            System.out.println(item);
//        }
    }

    public static void main(String[] args) {
        ArrayListEx app = new ArrayListEx();
        app.run();
    }
}



/*
NOTES:
    some methods:
        public ArrayList<type>(int initialCapacity) --> empty list w base type
        public boolean add(type element) --> adds element to end of list, inc size by 1
        public void add(int index, type element) --> adds at specified index, shifts elements up to make room, inc size by 1 (indexOutOfBounds if <0 or >size)
        public type get(int index) --> returns element at index
        public boolean remove(Object element) --> removes first occurance in list returns true if successful
 */
