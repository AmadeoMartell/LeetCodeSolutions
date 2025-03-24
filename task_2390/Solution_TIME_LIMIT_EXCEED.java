package task_2390;

class Solution_TIME_LIMIT_EXCEED {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = sb.indexOf("*");

        while (i > 0) {
            sb.deleteCharAt(i - 1);
            sb.deleteCharAt(i - 1);
            i = sb.indexOf("*");
        }
        if (i == 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution_TIME_LIMIT_EXCEED solution = new Solution_TIME_LIMIT_EXCEED();
        System.out.println(solution.removeStars("leet**cod*e"));
        System.out.println(solution.removeStars("erase*****"));
    }
}
