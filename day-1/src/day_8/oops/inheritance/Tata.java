package day_8.oops.inheritance;

public class Tata extends Car {

    public String model;
    public int price;

    public Tata() {
        super();
    }

    public Tata(String model, int price, String type) {
        super(type);
        this.model = model;
        this.price = price;
    }

    public void feature() {
        System.out.println("some feature");
    }
}
