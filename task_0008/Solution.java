package task_0008;

class Solution {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.myAtoi("-4444444444.2"));
    }
    public int myAtoi(String s) {
        if (s == null || s.isEmpty()) return 0;

        s = s.trim();
        int i = 0, n = s.length();
        boolean isNegative = false;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            isNegative = s.charAt(i) == '-';
            i++;
        }

        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            result = result * 10 + (s.charAt(i) - '0');
            if (result > Integer.MAX_VALUE) break;
            i++;
        }

        if (isNegative) result = -result;

        if (result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        return (int) result;
    }

}
