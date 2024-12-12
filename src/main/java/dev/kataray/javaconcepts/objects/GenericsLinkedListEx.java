package dev.kataray.javaconcepts.objects;

import java.util.ArrayList;

// generics allow you to define classes/interfaces/methods with a type parameter <E> in this class
// the type parameter (E) allows the class to work with any data type
// when creating an instance of this class, you specify the type

public class GenericsLinkedListEx<E> {
    private ListNode head;

    public GenericsLinkedListEx() {
        head = null;
    }

    // adds a new node to the start of the list
    // E is the generic type parameter, allowing the method to accept any type
    public void addANodeToStart(E addData) {
        head = new ListNode(addData, head);
    }

    // checks if a target element is in the list
    // E ensures that its same type as in list
    public boolean onList(E target) {
        return find(target) != null;
    }

    // calculates the length of the list
    public int length() {
        int count = 0;
        ListNode position = head;
        while (position != null) {
            count++;
            position = position.getLink();
        }
        return count;
    }

    // finds a specific element in the list
    private ListNode find(E target) {
        ListNode position = head;
        while (position != null) {
            E dataAtPosition = position.data;
            if (dataAtPosition.equals(target)) {
                return position;
            }
            position = position.link;
        }
        return null;
    }

    // converts the linked list to an ArrayList of type E
    public ArrayList<E> toArrayList() {
        ArrayList<E> list = new ArrayList<>(length());
        ListNode position = head;
        while (position != null) {
            list.add(position.data);
            position = position.link;
        }
        return list;
    }

    // inner class representing a node in the linked list
    // ListNode is also generic, using the same type parameter (E) as the outer class
    private class ListNode {
        private E data; // Stores the data of the node, of type E
        private ListNode link; // Points to the next node in the list

        public ListNode(E newData, ListNode linkValue) {
            data = newData;
            link = linkValue;
        }

        public ListNode getLink() {
            return link;
        }
    }

    public static void main(String[] args) {

        // Ex with String type
        GenericsLinkedListEx<String> stringList = new GenericsLinkedListEx<>();
        stringList.addANodeToStart("Hello");
        stringList.addANodeToStart("Goodbye");
        System.out.println("String list as ArrayList: " + stringList.toArrayList());

        // Ex with int
        GenericsLinkedListEx<Integer> numberList = new GenericsLinkedListEx<>();
        for (int i = 1; i <= 5; i++) {
            numberList.addANodeToStart(i);
        }
        System.out.println("Integer list as ArrayList: " + numberList.toArrayList());
    }
}
