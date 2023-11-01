
/*
*
* Generic implementation of node
*
* */
public class Node<T> {

    private T data;

    private Node<T> next;

    public Node(T data) {
        this.data = data;
        this.next = null;
    }

    public Node<T> getNext() {
        return this.next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getData() {
        return this.data;
    }

}
