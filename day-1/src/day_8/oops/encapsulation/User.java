package day_8.oops.encapsulation;

public class User {
    public String name = "test";
    private String password = "user@123";

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
