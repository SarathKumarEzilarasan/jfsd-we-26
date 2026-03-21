package solutions.blind75;

public class Arrays {
    public static void main(String[] args) {
        System.out.println(isAnagram("dogs", "god"));
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
            if (frequency[i] != 0){
              return false;
            }
        }

        return true;
    }
}
