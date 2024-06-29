package task_2433;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(Arrays.toString(solution.findArray(new int[]{5, 2, 0, 3, 1})));
    }
    public int[] findArray(int[] pref) {
        int n = pref.length;
        int arr[] = new int[n];
        arr[0] = pref[0];

        for(int i=1; i<n; i++){
            arr[i] = pref[i-1]^pref[i];
        }
        return arr;
    }
}
