/*********
 Given a string, find the length of the longest substring without repeating characters.

 Example 1:
 Input: "abcabcbb"
 Output: 3
 Explanation: The answer is "abc", with the length of 3.

 Example 2:
 Input: "bbbbb"
 Output: 1
 Explanation: The answer is "b", with the length of 1.

 Example 3:
 Input: "pwwkew"
 Output: 3
 Explanation: The answer is "wke", with the length of 3.
 Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */

package Medium;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        Map<Character, Integer> m = new HashMap();
        for (int i=0, j=0; i<s.length(); i++){
            if (max>=s.length()-j)
                return max;
            if (m.containsKey(s.charAt(i))){     // String.CharAt  time = 1
                j = Math.max(m.get(s.charAt(i)), j);
            }
            max = Math.max(max, i+1 -j);
            m.put(s.charAt(i), i+1);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcdedabf"));
    }
}
