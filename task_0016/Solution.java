package task_0016;

import java.util.*;

public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closest = nums[0] + nums[1] + nums[2];
        int closestDiff;
        for (int i = 0; i < nums.length - 2; i++) {
            closestDiff = nums[i] + twoSumClosest(nums, target - nums[i], i);
            if (Math.abs(target - closestDiff) < Math.abs(target - closest)) {
                closest = closestDiff;
            }
        }
        return closest;
    }


    public int twoSumClosest(int[] nums, int target, int ignoreInd) {
        int left = ignoreInd + 1, right = nums.length - 1;
        int closest = nums[left] + nums[right];
        int sum;
        while (left < right) {
            sum = nums[left] + nums[right];
            if (Math.abs(sum - target) < Math.abs(closest - target)) {
                closest = sum;
            }
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return closest;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
        //expect 2
    }
}
