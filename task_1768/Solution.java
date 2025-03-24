package task_1768;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < chars1.length && i < chars2.length) {
            sb.append(chars1[i]);
            sb.append(chars2[i]);
            i++;
        }
        while (i < chars1.length) {
            sb.append(chars1[i]);
            i++;
        }
        while (i < chars2.length) {
            sb.append(chars2[i]);
            i++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.mergeAlternately("abcd", "pq"));
    }
}