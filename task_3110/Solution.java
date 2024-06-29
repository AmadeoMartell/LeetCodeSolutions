package task_3110;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.scoreOfString("hello"));
        System.out.println(sol.scoreOfString("zaz"));
    }
    public int scoreOfString(String s) {
        int result = 0;
        char[] chars = s.toCharArray();
        for(int i = 0; i < s.length() - 1; i++){
            result += Math.abs(chars[i] - chars[i+1]);
        }
        return result;
    }
}
