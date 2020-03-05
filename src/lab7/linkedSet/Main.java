package lab7.linkedSet;

import lab6.Device;

public class Main {
    public static void main(String[] args) {
        MyLinkedSet myLinkedSet = new MyLinkedSet();
        MyLinkedSet myLinkedSet1 = new MyLinkedSet(myLinkedSet);
        MyLinkedSet myLinkedSet2 = new MyLinkedSet(new Device("First"));
        System.out.println(myLinkedSet.size());
        System.out.println("myLinkedSet.isEmpty() = " + myLinkedSet.isEmpty());
        System.out.println(myLinkedSet.add(new Device("SuperDevice!")));
        System.out.println(myLinkedSet.add(new Device("SuperDevice!")));
        System.out.println(myLinkedSet.add(new Device("SuperDevice!3")));
        System.out.println(myLinkedSet.size());
        System.out.println(myLinkedSet.isEmpty());
        System.out.println("contains = " + myLinkedSet.contains(new Device("SuperDevice!2")));
    }
}