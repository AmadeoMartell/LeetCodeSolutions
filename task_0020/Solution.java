package task_0020;

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        String brackets="[]{}()";
        int[] arr= new int[brackets.length()];
        Arrays.fill(arr,0);
        Deque<Character> q= new LinkedList<>();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = brackets.indexOf(ch);
            if(ch == ')' || ch == '}' || ch == ']'){
                counter--;
                try {
                    if ((arr[index] >= arr[index - 1]) || brackets.charAt(index - 1) != q.removeLast()) {
                        return false;
                    }
                } catch (NoSuchElementException e) { // fir leetcode just Exception e
                    return false;
                }
            } else if(ch == '{' || ch == '[' || ch == '('){
                counter++;
                q.add(ch);
            }
            arr[index]++;
        }
        return counter == 0;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("([])"));
    }
}
