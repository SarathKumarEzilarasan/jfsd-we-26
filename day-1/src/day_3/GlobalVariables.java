package day_3;

public class GlobalVariables {
    static int x; // global variable or class variable
    static String str;

    int y;

    public static void main(String[] args) {
        int x = 100; // local variables
        System.out.println(x);
        System.out.println(str);
    }

    public static void test() {
//        int x = 100;
        System.out.println(x);
    }

}
