package main.singlyLinkedList;

public class SinglyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int count;
    
    public Node<T> getHead() {
        return head;
    }
    
    public Node<T> getTail() {
        return tail;
    }
    
    public void setHead(Node<T> node) {
        head = node;
    }
    
    public void setTail(Node<T> node) {
        tail = node;
    }
    
    public int size() {
        return count;
    }
    
    public String toString() {
        return "";
    }
    
    public <T> T[] toArray() {
        Object[] array = new Object[size()];
        return (T[])array;
    }
    
    public void print() {
        System.out.println(toString());
    }
    
    public void addHead(T value) {
        
    }
    
    public void addTail(T value) {
        
    }
}
