package lab7;

import lab6.Device;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Main myMain = new Main();
        System.out.println(myMain.toString());
        MySet mySet = new MySet();
        MySet mySet2 = new MySet(new Device());
        MySet mySet3 = new MySet(new ArrayList<Device>());
        System.out.println(mySet.size());
        System.out.println(mySet.add(new Device()));
        System.out.println(mySet.size());
    }
}