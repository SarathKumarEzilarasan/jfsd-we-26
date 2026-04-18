package day_6;

public class StringDemo {

    // s= "123" , 123
    public static void main(String[] args) {
//        String s = "hello world"; // 103+101+..... -> 10100
        //          012345678910

//        int i = 'A';
//        System.out.println(i);
//        immutability();
//        stringMethods(s);

//        for (int i = 0; i < s.length(); i++) {
//            System.out.print(s.charAt(i));
//        }

//        isPalindrome(s);
//        System.out.println(_isPalindrome(s));

//        StringBuilder sb = new StringBuilder();
//        sb.append("hello"); // ['h','e','l','l','o']
//        sb.append(" world"); // ['h','e','l','l','o',' ','w','o'] -> hello world
//
//        System.out.println(sb);


//        String s = "hello";
//
//        int i = Integer.parseInt(s);
//        System.out.println(i);

        toInt("2.4"); // regex
    }

    public static void immutability() {
        // non primitive , heap , immutability
        String s1 = "hello world"; // 1 GB
        //           012345678910 ---> locations or index
        String s2 = "hello world"; // 1 GB ???
        String s3 = new String("hello world");


//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s3));

//        System.out.println(s1.replace("l","z"));
//        s1 = s1.toUpperCase();
//        System.out.println(s1);
    }

    public static void stringMethods(String s) {
//        System.out.println(s.charAt(1));
//        System.out.println(s.indexOf("e"));
//        System.out.println(s.startsWith("hel"));
//        System.out.println(s.endsWith("hel"));
//        System.out.println(s.contains("o wo"));
//        String s1 = "hello world";
//        System.out.println(s.compareTo(s1));
//        System.out.println(s.substring(0,4));
//        System.out.println(s.length());
//        System.out.println(s.charAt(s.length() - 1));
    }

    //palindrome
    public static void isPalindrome(String s) {
        // reverse
        // compare
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse = reverse + s.charAt(i);
            //         ""     + d -> reverse = d
            //         d      + l -> reverse = dl
            //         dl     + r -> reverse = dlr
        }

        if (s.equals(reverse)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }

    public static boolean _isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            char left = s.charAt(i);                         //    0 1 2 3 4 5
            char right = s.charAt(s.length() - 1 - i);       //    9 8 7 6 5 4
            if (left != right) {
                return false;
            }
        }
        return true;
    }

    public static void toInt(String s) {
        if (s == null || s.length() == 0) {
            System.out.println(0);
            return;
        }

        if (s.contains(".")) {
            System.out.println(s.charAt(0));
            return;
        }

        int result = 0;
        int place = 0;
        int endIndex = 0;

        if (s.charAt(0) == '-') {
            endIndex = 1;
        }

        for (int i = s.length() - 1; i >= endIndex; i--) {
            int ch = s.charAt(i) - 48;
            result = result + ch * (int) Math.pow(10, place);
            //       0      + 3 * 1 => result = 3
            //       3      + 2 * 10=> result = 23
            //       23     + 1 * 100 => result = 123
            place++;
        }

        if (s.charAt(0) == '-') {
            result = result * -1;
        }

        System.out.println(result);
    }
}
