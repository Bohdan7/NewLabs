package lab6;

public class Main {
    public static void main(String[] args) {
        House house = new House();

        Kettle boch = new Kettle("Boch", 5, 1, 42, true);
        house.addDevice(boch);
        boch.switchState();
        house.addDevice(new Kettle("Mirta",4,1,21,false));
        house.addDevice(new Chandelier("Torch",2,2,12,true));
        house.addDevice(new Phone("Samsung",1,3,2,true));
        System.out.println(house.getPowerResult());
        house.serchDevInduct(1,10);
        house.sortDevByPower();

    }
}