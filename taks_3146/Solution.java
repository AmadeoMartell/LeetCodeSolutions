package taks_3146;

class Solution {
    public static void main(String[] args) {
        String a = "abcde", b = "edbac";
        System.out.println(findPermutationDifference(a, b));
    }
    public static int findPermutationDifference(String s, String t) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += Math.abs(i - t.indexOf(s.charAt(i)));
        }

        return count;
    }
}
