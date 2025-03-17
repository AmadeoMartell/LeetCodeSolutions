package task_0009;

public class Solution_Numerical {
    public boolean isPalindrome(int x) {
        int temp = x;
        int reminder = 0;

        while (x > 0) {
            reminder = reminder * 10 + x % 10;
            x = x / 10;
        }

        return temp == reminder;
    }
}
