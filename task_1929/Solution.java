package task_1929;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getConcatenation(new int[]{1,2,3})));
    }
    public static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] concat = new int[n * 2];
        System.arraycopy(nums, 0, concat, 0, n);
        System.arraycopy(nums, 0, concat, n, n);
        return concat;
    }
}
