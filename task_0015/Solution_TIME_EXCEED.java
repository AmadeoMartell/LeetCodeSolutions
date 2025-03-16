package task_0015;

import java.util.*;

class Solution_TIME_EXCEED {


    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];

            List<Integer[]> targetArr = twoSum(nums, target, i);
            if (targetArr == null || targetArr.size() == 0) continue;
            for (var t : targetArr) {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(t[0]);
                list.add(t[1]);
                Collections.sort(list);
                res.add(list);
            }
        }

        return new ArrayList<>(res);
    }

    public static List<Integer[]> twoSum(int[] nums, int target, int ignoreInd) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer[]> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            if(i == ignoreInd) continue;
            int required = target - nums[i];
            if(map.containsKey(required)){
                list.add(new Integer[]{nums[map.get(required)], nums[i]});
            }
            map.put(nums[i], i);
        }
        return list;
    }

    public static void main(String[] args) {
        Solution_TIME_EXCEED solution = new Solution_TIME_EXCEED();
        System.out.println(solution.threeSum(new int[]{-1,0,1,2,-1,-4,-2,-3,3,0,4}));
    }
}
