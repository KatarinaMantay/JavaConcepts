package dev.kataray.javaconcepts.generics;

public class GenericMain {
    public static void main(String[] args) {
        Generic<String> test = new Generic<>();

        String a = "hi";
        String b = "test";

        test.addToList(a);
        test.addToList(b);

        test.listContents();


    }
}
