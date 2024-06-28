package task_0003;

import java.util.HashSet;

public class Soltuion_2 {
    public static void main(String[] args) {
        String s = "abcdeodsasazxcvbnm,./";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> x = new HashSet<>();
        int i = 0, j = 0, max = 0;
        while(j < s.length())
        {
            if(!x.contains(s.charAt(j)))
            {
                x.add(s.charAt(j));
                j++;
                max = Math.max(max,j-i);
            }
            else
            {
                x.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}
