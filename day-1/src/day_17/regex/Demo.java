package day_17.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {
        String text = "test123@gmail.com";
        String regex = "^\\w{3,100}@[a-z]{5,10}.[a-z]{2,3}";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

//        while (matcher.find()) {
//            System.out.println(matcher.start());
//        }

        System.out.println(matcher.find());

    }
}

//   \d, \D , \w , \W , \s , \S
//   {2} , {2,4} , {2,} , * , +
//   ^ , $
//   [ab] , [a-z] , [0-9] , [A-Z] , [aA-zZ]