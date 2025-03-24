package task_2390;

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public String removeStars(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c == '*') {
                try {
                    stack.removeLast();
                } catch (Exception e) {
                }
            } else {
                stack.addLast(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.removeFirst());
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.removeStars("leet**cod*e"));
        //expected "lecoe"
        //actual "leecode"
        System.out.println(solution.removeStars("erase*****"));
        //expected "e"
        System.out.println(solution.removeStars("abb*cdfg*****x*"));
        //expected "a"
        //actual "ab"
    }
}
