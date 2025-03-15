package task_0013;

import java.util.HashMap;

public class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            switch (c) {
                case 'I':
                    res += (map.containsKey('V') || map.containsKey('X')) ? -1 : 1;
                    break;
                case 'X':
                    res += (map.containsKey('L') || map.containsKey('C')) ? -10 : 10;
                    break;
                case 'C':
                    res += (map.containsKey('D') || map.containsKey('M')) ? -100 : 100;
                    break;
                case 'M':
                    res += 1000;
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'V':
                    res += 5;
                    break;
                default:
                    break;
            }

            map.putIfAbsent(c, 1);
        }
        return res;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.romanToInt("III"));
        System.out.println(solution.romanToInt("LVIII"));
        System.out.println(solution.romanToInt("MCMXCIV"));
    }
}
