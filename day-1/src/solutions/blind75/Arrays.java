package solutions.blind75;

public class Arrays {
    public static void main(String[] args) {
//        System.out.println(isAnagram("dogs", "god"));
        String[] stringArr = {"HelloWorld", "World"};
        encodeDecodeString(stringArr);
    }

    // time  -> o(n)
    // space -> o(1)
    public static boolean isAnagram(String s, String t) {
        int[] frequency = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int ch = s.charAt(i) - 97;
            frequency[ch]++;
        }
        // [1,1,1,1,1,1,1,1,1,1,1,1,1,1]

        for (int i = 0; i < t.length(); i++) {
            int ch = t.charAt(i) - 97;
            frequency[ch]--;
        }
        // [0,1,1,1,1,1,1,1,1,1,1,1,1,1]

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void encodeDecodeString(String[] strings) {
        String encodedString = encode(strings);
//        System.out.println(encodedString);
        String[] _stringArr = decode(encodedString, strings.length);

        for (int i = 0; i < _stringArr.length; i++) {
            System.out.print(_stringArr[i] + " ");
        }
    }

    // 5#Hello5#World -> 5 substring(i,i+5)
    // 0123456789101112
    //        i
    public static String encode(String[] strings) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strings.length; i++) {
            String s = strings[i];
            sb.append(s.length()).append("#").append(s);
        }

        return sb.toString();
    }

    public static String[] decode(String str, int n) {
        String[] result = new String[n];
        int x = 0;
        int i = 0;
        while (i < str.length()) {
            int len = Integer.parseInt(str.charAt(i) + "");
            i = i + 2;
            String s = str.substring(i, i + len);
            result[x] = s;
            x++;
            i = i + len;
        }


        return result;
    }
}
