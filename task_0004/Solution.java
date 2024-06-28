package task_0004;

class Solution {
    public static void main(String[] args) {
        int[] num1 = {1,2,3,4,5};
        int[] num2 = {6,7,8,9,10};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0 && nums2.length == 0) return 0;
        int i = 0, j = 0, k = 0;
        int[] merged = new int[nums1.length + nums2.length];
        while (i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                merged[k] = nums1[i];
                i++;
            }else {
                merged[k] = nums2[j];
                j++;
            }
            k++;
        }
        while (i < nums1.length){
            merged[k++] = nums1[i++];
        }
        while (j < nums2.length){
            merged[k++] = nums2[j++];
        }
        int mid = merged.length / 2;
        if(merged.length % 2 == 0){
            return (merged[mid - 1] + merged[mid]) / 2.0;
        }
        return merged[mid];
    }
}
