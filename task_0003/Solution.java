package task_0003;

import java.util.HashSet;

class Solution {
    public static void main(String[] args) {
        String s = "";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 1){
            return 1;
        }
        int n = 0;
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < chars.length - 1; i++){
            set.add(chars[i]);
            if(chars.length - i+1 < n) break;
            for (int j = i+1; j < chars.length; j++) {
                if(set.contains(chars[j])) break;
                set.add(chars[j]);
            }
            if(set.size() > n) n = set.size();
            set.clear();
        }
        return n;
    }
}
