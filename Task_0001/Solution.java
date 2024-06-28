package Task_0001;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3, 3};
        System.out.println(Arrays.toString(twoSum(nums, 6)));
    }
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int required = target - nums[i];
            if(map.containsKey(required)){
                return new int[]{map.get(required), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{0, 0};
    }
}
