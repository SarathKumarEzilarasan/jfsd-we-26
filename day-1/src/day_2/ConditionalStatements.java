package day_2;

public class ConditionalStatements {

    public static void main(String[] args) {
//        // given a number we need to find whether its odd or even
//        int num = 100;
//
//        if (num % 2 == 0){
//            System.out.println("number is even");
//        }else {
//            System.out.println("number is odd");
//        }

        // given 2 numbers find which one is greater
//        int a = 200;
//        int b = 200;
//
//
//        if (a > b) {
//            System.out.println("a is greater");
//        } else if (a == b) {
//            System.out.println("a and b are equal");
//        } else {
//            System.out.println("b is greater");
//        }

        int a = 200;
        int b = 500;
        int c = 300;

        if (a > b && a > c) {
            System.out.println("a is greater");
        } else if (b > a && b > c) {
            System.out.println("b is greater");
        } else if (c > a && c > b) {
            System.out.println("c is greater");
        }
    }
    // if, if else , if elseif else , switch case
//    public static void main(String[] args) {
//        // &, |
////        int age = 17;
////        int amount = 200;
//
////        if (age >=18 || 1/0 >0){
////            System.out.println("from if");
////        }
//
//        int day = 3;
//
////        if (day == 1) {
////            System.out.println("sun");
////        } else if (day == 2) {
////            System.out.println("mon");
////        } else if (day == 3) {
////            System.out.println("tue");
////        } else if (day == 4) {
////            System.out.println("wed");
////        } else if (day == 5) {
////            System.out.println("thurs");
////        } else if (day == 6) {
////            System.out.println("fri");
////        } else if (day == 7) {
////            System.out.println("sat");
////        } else {
////            System.out.println("invalid input");
////        }
//
//        switch (day) {
//            case 1:
//                System.out.println("sun");
//                break;
//            case 2:
//                System.out.println("mon");
//                break;
//            case 3:
//                System.out.println("tue");
//                break;
//            case 4:
//                System.out.println("wed");
//                break;
//            case 5:
//                System.out.println("thurs");
//                break;
//            case 6:
//                System.out.println("fri");
//                break;
//            case 7:
//                System.out.println("sat");
//                break;
//            default:
//                System.out.println("invalid input");
//        }
//
//    }
//    public static void main(String[] args) {
//        // &, |
//        int age = 17;
//        int amount = 200;
//
//        if (age >= 18 & amount >= 120) {
//            System.out.println("you are allowed");
//        } else if (amount < 120) {
//            System.out.println("insufficient balance");
//        } else {
//            System.out.println("you are underage");
//        }
//    }
}
