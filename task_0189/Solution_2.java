package task_0189;

import java.util.Arrays;

public class Solution_2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4 ,5};
        Solution_2 sol = new Solution_2();
        sol.rotate(arr, 4);
        System.out.println(Arrays.toString(arr));
    }
    public void rotate(int[] nums, int k) {
        if(nums.length == 1 || k == 0) {
            return;
        }
        k %= nums.length;

        int[] rotated = new int[nums.length];

        System.arraycopy(nums, nums.length - k, rotated, 0, k);
        System.arraycopy(nums, 0, rotated, k, nums.length - k);
        System.arraycopy(rotated, 0, nums, 0, nums.length);

    }
}
