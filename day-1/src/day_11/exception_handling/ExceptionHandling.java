package day_11.exception_handling;

public class ExceptionHandling {
    public static void main(String[] args) {
//        add();
        try {
            printAge(17);
        } catch (Exception e) {
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
        }

//        printAge(17);
//        printAge(10);



    }

    public static void print(int age) throws Exception {
        printAge(age);
    }

    public static void printAge(int age) throws Exception {
        if (age < 18) {
//            throw new Exception("Age is below the limit");
            throw new AgeException("Age is below the limit");
        }
    }

    public static void add() {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
            System.out.println("from catch block");
        }
    }

    public static void exceptionHandling() {
        try {
            System.out.println(1);
        } catch (ArithmeticException e) {
            System.out.println("from ArithmeticException catch block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("from ArrayIndexOutOfBoundsException catch block");
        } catch (Exception e) {
            System.out.println("from catch block");
        } finally {
            System.out.println("from finally block");
        }
    }
}

class AgeException extends Exception {
    public AgeException(String message) {
        super(message);
    }
}