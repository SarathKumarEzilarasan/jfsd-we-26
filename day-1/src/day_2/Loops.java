package day_2;

public class Loops {
    // iteration
    // while, for , do while

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

//    public static void main(String[] args) {
//        int counter = 3;
//        while (counter > 0) {
//            System.out.println(counter);
//            counter--;
//        }
//
//        for (int counter = 3; counter > 0; counter--) {
//            System.out.println(counter);
//        }
//
//        int counter = 0;
//        do {
//            System.out.println(counter);
//            counter--;
//        } while (counter > 0);
//
//    }
}
