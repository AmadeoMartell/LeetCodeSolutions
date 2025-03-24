package task_0035;

class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int mid;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                while (mid >= 0 && nums[mid] == target) {
                    mid--;
                }
                return mid + 1;
            }
            if (nums[mid] < target) {
                left = mid + 1;
            }
            if (nums[mid] > target) {
                right = mid - 1;
            }
        }
        while (left < nums.length) {
            if (nums[left] > target) {
                return left;
            }
            left++;
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = {1,1};
        System.out.println(solution.searchInsert(nums1, 1));
    }
}