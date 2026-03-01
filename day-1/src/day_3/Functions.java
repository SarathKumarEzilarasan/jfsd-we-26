package day_3;

public class Functions {



    // main function or main method
    public static void main(String[] args) {
//        add(100, 200); // function call or function invocation
//        add(300, 400);
//        add(500, 600);

        // x+y-z
        int sum = add(100, 200);
        System.out.println(sum - 300);

    }

    // main -> add , sub


    // custom function or user defined function
    // function definition
    // function signature
    public static int add(int a, int b) // function parameters or arguments
    {// function body
        int x = a;
        int y = b;
        System.out.println(x + y);
        return x + y;
//        System.out.println("hello");
    }

}

// code duplication -> reuse a logic -> functions