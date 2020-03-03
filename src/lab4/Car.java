package lab4;

/**
 * Special class for Car.
 */
public class Car {
    private String type;
    private String brand;
    private String model;
    private String color;
    private int productionYear;
    private String owner;
    private int hp;
    /**
     * My super method.
     * @param type the type of the car
     * @param brand
     * @param model
     * @param color
     * @param productionYear
     * @param owner
     * @param hp
     */
    public Car(String type, String brand, String model, String color, int productionYear, String owner, int hp) {
        this.type = type;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.owner = owner;
        this.hp = hp;
    }

    public Car() {
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getHp() {
        return hp;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getOwner() {
        return owner;
    }

    public void setType(String type) {
        this.type = type;
    }

    /**
     * 123
     * @param brand 234
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String toString() {
        return type + " " + brand + " " + model + " " + color + " " + productionYear + " " +
                owner + " " + hp;
    }

}