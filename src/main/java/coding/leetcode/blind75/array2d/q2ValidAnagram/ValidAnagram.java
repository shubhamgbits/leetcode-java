package coding.leetcode.blind75.array2d.q2ValidAnagram;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();

        for(char c: s.toCharArray()){
            sMap.put(c, sMap.getOrDefault(c, 0)+1);
        }
        for(char c: t.toCharArray()){
            tMap.put(c, tMap.getOrDefault(c, 0)+1);
        }

        for(char key : tMap.keySet()){
            if(!sMap.containsKey(key)|| !sMap.get(key).equals(tMap.get(key)))
                return false;
        }
        return true;
    }
}
