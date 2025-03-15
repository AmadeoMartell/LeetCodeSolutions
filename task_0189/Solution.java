package task_0189;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4 ,5};
        Solution sol = new Solution();
        sol.rotate(arr, 2);
        System.out.println(Arrays.toString(arr));
    }
    public void rotate(int[] nums, int k) {
        if(nums.length == 1 || k == 0) {
            return;
        }
        k %= nums.length;

        int[] rotated = new int[nums.length];
        int j = 0;

        for (int i = nums.length - k; i < nums.length; i++) {
            rotated[j++] = nums[i];
        }

        for (int i = 0; i < nums.length - k; i++) {
            rotated[j++] = nums[i];
        }

        System.arraycopy(rotated, 0, nums, 0, nums.length);
    }
}
