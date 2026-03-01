package day_3;

public class StaticKeyword {

    static int z = 100;
    int a = 200;


    static {
        System.out.println("hello world");
    }

//    public static void main(String[] args) {
//        System.out.println(z);
//
//        StaticKeyword s1 = new StaticKeyword();
//        System.out.println(s1.a);
//        s1.add();
//    }

    public void add() {

    }

    public static void main(String[] args) {
        GlobalVariables g1 = new GlobalVariables();
        g1.x = 100;

        GlobalVariables g2 = new GlobalVariables();
        g2.x = 200;

        System.out.println(GlobalVariables.x);
//        System.out.println(GlobalVariables.y);
    }
}
