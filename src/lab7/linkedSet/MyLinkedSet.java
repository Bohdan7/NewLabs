package lab7.linkedSet;

import lab6.Device;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class MyLinkedSet implements Set<Device> {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedSet() {
    }

    public MyLinkedSet(Device device) {
        add(device);
    }

    public MyLinkedSet(Collection<Device> devices) {
        for (Device device : devices) {
            add(device);
        }
    }

    /**
     * MY super method!!!
     *
     * @return cool value
     */
    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node currentNode = head;
        while (currentNode != null) {
            if (currentNode.getElement().equals(o)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Device element) {
        Node newNode = new Node(element);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
        }
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}