package dev.kataray.javaconcepts.objects;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {

        // how we create a hashset object
        HashSet<Integer> hashSet = new HashSet<Integer>();

        // add to hashSet
        hashSet.add(2);
        hashSet.add(7);
        hashSet.add(7);
        hashSet.add(3);
        printSet(hashSet);

        // remove from hashset
        hashSet.remove(3);
        printSet(hashSet);

        // contains will return true if in set
        System.out.println("does set contain 2: " + hashSet.contains(2));
        System.out.println("does set contain 3: " + hashSet.contains(3));
    }

    public static void printSet(HashSet<Integer> set) {

        // how to print out the set
        System.out.println("The set contains:");
        Object[] arr = set.toArray();

        for (int i = 0; i < set.toArray().length; i++) {
            System.out.println(arr[i]);
        }
    }
}
