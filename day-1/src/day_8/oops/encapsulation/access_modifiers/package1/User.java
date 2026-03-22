package day_8.oops.encapsulation.access_modifiers.package1;

public class User {


//    private -> can be accessed only within the class
//    default -> same class + different classes in the same package
//    protected -> same class + different classes in the same package + child classes in different package
//    public  -> anyone can access it
//
//    private > default > protected > public ---> access modifiers

    public String name = "test";
    public static String password = "user@123";

    // getter method
    public String getPassword() {
        return password;
    }

    // setter method
    public void setPassword(String password) {
        this.password = password;
    }

    public static void main(String[] args) {
        User user = new User();
        System.out.println(user.password);
    }
}
