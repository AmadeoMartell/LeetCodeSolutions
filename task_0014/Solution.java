package task_0014;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        int minLength = strs[0].length();

        for(int i = 1; i < strs.length; i++) {
            if(strs[i].length() < minLength){
                minLength = strs[i].length();
            }

            for(int j = 0; j < minLength; j++){
                if(prefix.charAt(j) != strs[i].charAt(j)){
                    minLength = j;
                    break;
                }
            }
        }

        return prefix.substring(0, minLength);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[] strs = new String[]{"flower","flow","flight"};
        System.out.println(solution.longestCommonPrefix(strs));
    }
}
