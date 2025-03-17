package task_0007;

public class Solution {
    public int reverse(int x) {
        long reminder = 0;
        boolean negative = x < 0;
        if (negative) {
            x = -x;
        }
        while (x > 0) {
            reminder = reminder * 10 + x % 10;
            x = x / 10;
        }
        if (reminder > Integer.MAX_VALUE || reminder < Integer.MIN_VALUE) {
            return 0;
        }else {
            return (int) reminder * (negative ? -1 : 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverse(1534236469));
    }
}
