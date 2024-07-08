package task_1470;

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] num = {1,1,2,2};
        System.out.println(Arrays.toString(shuffle(num, 2)));
    }
    public static int[] shuffle(int[] nums, int n) {
        int[] shuffled = new int[nums.length];
        for (int i = 0, j = 0; i < n && j < n*2; i++, j+=2) {
            shuffled[j] = nums[i];
            shuffled[j+1] = nums[i + n];
        }
        return shuffled;
    }
}
