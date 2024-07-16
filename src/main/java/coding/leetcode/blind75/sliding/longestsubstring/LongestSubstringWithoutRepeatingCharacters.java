package coding.leetcode.blind75.sliding.longestsubstring;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int max_len = 0;
        Set<Character> charSet = new HashSet<>();
        char[] charArray = s.toCharArray();
        int leftIndex = 0;

        for(int i =1; i<charArray.length; i++){
            char rightElement = charArray[i];
            while(charSet.contains(rightElement)){
                charSet.remove(charArray[i]);
                leftIndex++;
            }
            max_len = Math.max(max_len, i-leftIndex+1);
        }

        return max_len;

//        Deque<String> queue = new ArrayDeque<>();
//        queue.o
    }
}
