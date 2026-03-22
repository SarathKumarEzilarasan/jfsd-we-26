package day_8.oops.encapsulation;

public class Demo {
    public static void main(String[] args) {
        User user = new User();
//        System.out.println(user.password);
        System.out.println(user.getPassword());
        user.setPassword("test@1234");
        System.out.println(user.getPassword());
    }
}
