package main.singlyLinkedList;

public class Node<T> {
    private T value;
    private Node<T> next;
    
    Node(T v) {
        value = v;
    }
    
    public T getValue() {
        return value;
    }
    
    public void setValue(T v) {
        value = v;
    }
    
    public Node<T> getNext() {
        return next;
    }
    
    public void setNext(Node<T> node) {
        next = node;
    }
}
