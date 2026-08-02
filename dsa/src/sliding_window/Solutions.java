package sliding_window;

import java.util.HashSet;
import java.util.Set;

public class Solutions {
    public static void main(String[] args) {
        int[] arr = {10, 1, 5, 6, 7, 1};
//        int maxProfit = maxProfit(arr);
//        System.out.println(maxProfit);

//        System.out.println(lengthOfLongestSubstring("zxyyxyz"));
        System.out.println(characterReplacement("AAABABB", 1));
    }

    // https://neetcode.io/problems/buy-and-sell-crypto/question?list=blind75
    private static int maxProfit(int[] arr) {
        int left = 0;
        int maxProfit = 0;

        for (int right = 1; right < arr.length; right++) {
            if (arr[right] < arr[left]) {
                left = right;
            } else {
                maxProfit = Math.max(maxProfit, arr[right] - arr[left]);
            }
        }

        return maxProfit;
    }

    //    https://neetcode.io/problems/longest-substring-without-duplicates/question?list=blind75
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(c);
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    //    https://neetcode.io/problems/longest-repeating-substring-with-replacement/question?list=blind75
    public static int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxFreq = 0;
        int result = 0;

        for (int right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'A';
            count[idx]++;
            maxFreq = Math.max(maxFreq, count[idx]);

            int windowSize = right - left + 1;

            if (windowSize - maxFreq > k) {
                count[idx]--;
                left++;
            }

            result = Math.max(result, right - left + 1);
        }


        return result;
    }

}
