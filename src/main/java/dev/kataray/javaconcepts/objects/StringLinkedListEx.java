package dev.kataray.javaconcepts.objects;

public class StringLinkedListEx {

    public static void main(String[] args) {

        // setting up a LinkedList
        StringLinkedListEx list = new StringLinkedListEx();

        // adds a node to the front of the list (prev ones are linked behind head)
        list.addANodeToStart("One");
        list.addANodeToStart("Two");
        list.addANodeToStart("Three");

        System.out.println("List has " + list.length() + " entries.");
        list.showList();

        // checks if the value is in the list
        if (list.onList("Three")) {
            System.out.println("Three is on list");
        } else {
            System.out.println("not on list");
        }

        // removes the head node
        list.deleteHeadNode();

        // checks for value in the LL
        if (list.onList("Three")) {
            System.out.println("Three is on list");
        } else {
            System.out.println("Three is not on list.");
        }

        list.deleteHeadNode();
        list.deleteHeadNode();

        list.showList();
    }

    // head is the first node in the LL
    private ListNodeEx head;

    // constructor setting front to null
    public StringLinkedListEx() {
        head = null;
    }

    //  method to display the LL
    public void showList() {

        // set pos to front
        ListNodeEx position = head;

        while (position != null) {
            System.out.println(position.getData());
            // get link will go to the next node!
            position = position.getLink();
        }
    }

    // return num of nodes in LL
    public int length() {
        int count = 0;
        ListNodeEx position = head;

        while (position != null) {
            count++;
            position = position.getLink();
        }
        return count;
    }

    // adding a node to the start -- replaces head and links to head
    public void addANodeToStart(String addData) {
        head = new ListNodeEx(addData, head);
    }

    // deletes first node
    public void deleteHeadNode() {
        if (head != null) {
            // replaces head with the next node (deleting it)
            head = head.getLink();
        } else {
            System.out.println("list is empty -- cant delete");
        }
    }

    // check for specific value in LL
    public boolean onList(String target) {
        // returns true if the target is in the LL
        return find(target) != null;
    }

    // returns reference to first target found in the LL
    private ListNodeEx find(String target) {

        ListNodeEx position = head;
        while (position != null) {
            if (position.getData().equals(target)) {
                return position;
            }
            position = position.getLink();
        }
        return null;
    }

    // NOTE: GOOD PRACTICE TO PUT THE NODE AS AN INNER CLASS TO AVOID LEAKS
    public static class ListNodeEx {

        // every node in a LL, has data(element) and a link pointing to the next node
        // to create a Linked List from scratch, you must create the node class first...
        public String data;
        public ListNodeEx link;

        // initialize by setting to null
        public ListNodeEx() {
            link = null;
            data = null;
        }

        // creating a new node with data and a link
        public ListNodeEx(String newData, ListNodeEx linkValue) {
            data = newData;
            link = linkValue;
        }

        // setter for data
        public void setData(String newData) {
            data = newData;
        }

        // getter for data
        public String getData() {
            return data;
        }

        // setter for link
        public void setLink(ListNodeEx newLink) {
            link = newLink;
        }

        // getter for link
        public ListNodeEx getLink() {
            return link;
        }
    }
}
