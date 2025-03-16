package task_0015;

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) break;
            int target = -nums[i];

            List<Integer[]> targetArr = twoSum(nums, target, i);
            if (targetArr == null || targetArr.size() == 0) continue;
            for (var t : targetArr) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(t[0]);
                list.add(t[1]);
                res.add(list);
            }
        }

        return new ArrayList<>(res);
    }

    public static List<Integer[]> twoSum(int[] nums, int target, int ignoreInd) {
        List<Integer[]> list = new ArrayList<>();
        int left = ignoreInd + 1, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == target) {
                list.add(new Integer[]{nums[left], nums[right]});
                int leftVal = nums[left], rightVal = nums[right];
                while (left < right && nums[left] == leftVal) left++;
                while (left < right && nums[right] == rightVal) right--;
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4}));
    }
}