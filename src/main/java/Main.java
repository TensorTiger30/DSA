public class Main {

    public static void main(String[] args) {

        // Initialize the first linked list
        LinkedListCustom<Integer> linkedListCustom = new LinkedListCustom<>();

        // Traverse the linked list and print the Node values
        linkedListCustom.traverse();
        // Insert elements to the beginning of the linked list
        linkedListCustom.insert(20);
        // Traverse the linked list and print the Node values
        linkedListCustom.traverse();
        linkedListCustom.insert(30);
        // Traverse the linked list and print the Node values
        linkedListCustom.traverse();
        linkedListCustom.insert(40);
        // Traverse the linked list and print the Node values
        linkedListCustom.traverse();
        linkedListCustom.insert(50);
        // Traverse the linked list and print the Node values
        linkedListCustom.traverse();

        // Create a second linked list with head node initialized

        // Define a head node
        Node<String> head = new Node<>("Ghosh");

        System.out.println("<============================>");

        // Initialize the second linked list
        LinkedListCustom<String> linkedListCustom1 = new LinkedListCustom<>(head);
        // Traverse the linked list and print the Node values
        linkedListCustom1.traverse();

        // Insert the elements into the second linked list
        linkedListCustom1.insert("Partho");
        // Traverse the linked list and print the Node values
        linkedListCustom1.traverse();
        linkedListCustom1.insert("is");
        // Traverse the linked list and print the Node values
        linkedListCustom1.traverse();
        linkedListCustom1.insert("name");
        // Traverse the linked list and print the Node values
        linkedListCustom1.traverse();
        linkedListCustom1.insert("My");
        // Traverse the linked list and print the Node values
        linkedListCustom1.traverse();

    }

}
