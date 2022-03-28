package main.java.computer;

public class LinkedList<T> {
    private T value;
    private LinkedList<T> next;

    public LinkedList(T value) {
        this.value = value;
    }

    public void setNext(LinkedList<T> next) {
        this.next = next;
    }

    public LinkedList<T> getNext() {
        return next;
    }

    public T getValue() {
        return value;
    }

    public void printList(LinkedList<T> node) {
        System.out.println("Node is " + node.getValue());
        if (node.getNext() != null) printList(node.getNext());
    }

}