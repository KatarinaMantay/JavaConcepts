package dev.kataray.javaconcepts.objects;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {

        // how to setup the hashmap
        // Hash maps have a key and element <key, element>
        HashMap<String, Integer> people = new HashMap<String, Integer>();

        // "put" adds an element to the hashmap
        people.put("Katie",29029);
        people.put("Kat",28251);
        people.put("Kataray",28169);
        people.put("Katarina",20335);
        printMap(people);

        // containsKey will return true if its in map
        System.out.println("\nKataray in map?: " + people.containsKey("Kataray") + "\n");

        // edit values in map using put (will overwrite)
        System.out.println("Changing student num of Kataray");
        people.put("Kataray", 12345);
        System.out.println("Katarays new num = " + people.get("Kataray") + "\n");

        // remove function removes from map
        System.out.println("Removing Katarina.");
        people.remove("Katarina");
        printMap(people);

    }

    // to print out map
    public static void printMap(HashMap<String, Integer> map) {

        // for each key in map, will print out the key and its value
        for (String key : map.keySet()) {
            System.out.println("KEY: " + key + " | VALUE: " + map.get(key));
        }

    }
}

