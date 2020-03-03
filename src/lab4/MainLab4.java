package lab4;

import java.util.Arrays;
import java.util.Comparator;

public class MainLab4 {
    public static void main(String[] args) {
        Car[] cars = new Car[3];

        cars[0]= new Car();
        cars[0].setType("Truck");
        cars[0].setBrand("Volvo");
        cars[0].setColor("Gray");
        cars[0].setModel("212");
        cars[0].setOwner("Steev");
        cars[0].setProductionYear(2016);
        cars[0].setHp(250);

        cars[1]= new Car();
        cars[1].setType("Сoupe");
        cars[1].setBrand("BMW");
        cars[1].setColor("Black");
        cars[1].setModel("M5");
        cars[1].setOwner("Valera");
        cars[1].setProductionYear(2019);
        cars[1].setHp(180);

        cars[2]= new Car();
        cars[2].setType("Universal");
        cars[2].setBrand("Audi");
        cars[2].setColor("Pink");
        cars[2].setModel("A30");
        cars[2].setOwner("Bill");
        cars[2].setProductionYear(2018);
        cars[2].setHp(125);

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparingInt(Car::getProductionYear));
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, Comparator.comparingInt(Car::getHp).reversed());

        System.out.println(Arrays.toString(cars));

    }
}
