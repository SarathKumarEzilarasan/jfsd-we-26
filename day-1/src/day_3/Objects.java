package day_3;

public class Objects {
    public static void main(String[] args) {
        String s = "hello";

        Functions functions = new Functions(); // objects or instances
        functions.add(100, 200);


        User sarath = new User();
        sarath.name = "sarath";
        sarath.accountNumber = 100000;
        sarath.mobileNumber = 10000000l;


        User john = new User();
        john.name = "john";
        john.accountNumber = 100000;
        john.mobileNumber = 10000000l;


    }
}

// user -> account number , salary, address , mobile , aadhaar ,......