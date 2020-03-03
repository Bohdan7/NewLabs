package lab6;

public class Device {
    private String name;
    private int power;
    private int amount;
    private int induction;
    private boolean on;

    public Device(String name, int power, int amount, int induction, boolean on) {
        this.name = name;
        this.power = power;
        this.amount = amount;
        this.induction = induction;
        this.on = on;
    }

    public Device() {
    }

    public Device(String name) {
        this.name = name;
    }

    public void switchState() {
        on = !on;
    }

    public boolean isOn() {
        return on;
    }

    public int getAmount() {
        return amount;
    }

    public int getInduction() {
        return induction;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String toString() {
        return name + " " + power + " " + amount + " " + induction + " " + on + "\n";
    }

}
