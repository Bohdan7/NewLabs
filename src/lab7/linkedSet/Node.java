package lab7.linkedSet;

import lab6.Device;

public class Node {
    private Device element;
    private Node next;
    private Node previous;

    public Node(Device element) {
        this.element = element;
    }

    public void setNext(Node node) { next = node; }

    public Device getElement() {
        return element;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() { return previous; }

    public void setPrevious(Node previous) { this.previous = previous; }
}