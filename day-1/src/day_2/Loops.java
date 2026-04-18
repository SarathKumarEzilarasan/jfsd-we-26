package day_2;

public class Loops {
    // iteration
    // while, for , do while

    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5 - i; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

//        for (int i = 1; i <= 5; i++) {
//            for (int k = 1; k <= 5 - i; k++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }


//        for (int i = 1; i <= 5; i++) {
//            if (i == 4) {
//                break;
//            }
//            System.out.println(i);
//        }

        for (int i = 0; i < 4; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            String result = rotate((int) Math.pow(11, i));
            System.out.print(result);
            System.out.println();
        }
    }

    public static String rotate(int num) {
        String str = "";

        while (num > 0) {
            int x = num % 10;
            num = num / 10;
            str = str + x + " ";
        }

        return str;
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
