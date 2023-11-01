/*
*
* Generic implementation of linked list
*
* */
public class LinkedListCustom<T> {

    private Node<T> head;

    /*
     *
     * Empty Constructor to create a LinkedList
     *
     * */
    public LinkedListCustom() {
    }

    /*
    *
    * Parameterized Constructor to create a LinkedList
    * @param head - Set the head node of the linked list
    *
    * */
    public LinkedListCustom(Node<T> head) {
        this.head = head;
    }

    /*
     *
     * Function to insert node at the beginning of the linked list
     * @param data can be any integer value
     *
     * */
    public void insert(T data) {
        // Create a new node
        Node<T> node = new Node<>(data);
        // Check if head node is available for the linked list
        if (this.head == null) {
            head = node;
            return;
        }

        /*
         *
         * Head node is present
         * Point the new node to next of current head
         *
         * */
        node.setNext(head);

        // Point the current head to new node
        this.head = node;
    }

    /*
     *
     * Function to traverse a linked list
     *
     * */
    public void traverse() {
        // Create a temp reference to head node
        Node<T> temp = this.head;
        // Use a while loop to traverse the linked list
        while (temp != null) {
            System.out.print(temp.getData() + "->");
            temp = temp.getNext();
        }
        System.out.println();
    }


}
