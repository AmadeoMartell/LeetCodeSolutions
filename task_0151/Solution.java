package task_0151;

import java.util.StringJoiner;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseWords(" a good   example"));
    }
    public String reverseWords(String s) {
        String[] result = s.trim().split("\s+");
        StringJoiner joiner = new StringJoiner(" ");
        for (int i = result.length - 1; i >= 0; i--) {
            joiner.add(result[i]);
        }
        return joiner.toString();
    }
}
//Input: s = "a good   example"
//Output: "example good a"
//Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.