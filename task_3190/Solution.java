package task_3190;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {1,2,3,4};
        System.out.println(solution.minimumOperations(arr));
    }
    public int minimumOperations(int[] nums) {
        int count = 0;
        for (int iter: nums){
            if(iter % 3 == 0) continue;
            if ((iter + 1) % 3 == 0 || (iter - 1) % 3 == 0) count++;
        }
        return count;
    }
}
