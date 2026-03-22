package day_8.oops.inheritance;

public class Car {
    public String type;

    public Car() {

    }

    public Car(String type) {
        this.type = type;
    }

    public void breaks() {
        System.out.println("breaking system");
    }
}
