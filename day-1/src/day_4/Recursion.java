package day_4;

public class Recursion {

    public static void main(String[] args) {
        print(20);
    }

    public static void print(int num) {
        if (num == 0) {
            return;
        }
        System.out.println(num);
        print(--num);
    }
}

