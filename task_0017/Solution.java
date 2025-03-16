package task_0017;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty()) {
            return new ArrayList<>();
        }
        HashMap<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        List<String> list = new ArrayList<>();
        possibleCombinations(0, digits, new StringBuilder(), list, map);

        return list;
    }

    public void possibleCombinations(int index, String digits, StringBuilder path, List<String> result, Map<Character, String> map) {
        if (index == digits.length()) {
            result.add(path.toString());
            return;
        }

        for (char digit : map.get(digits.charAt(index)).toCharArray()) {
            path.append(digit);
            possibleCombinations(index + 1, digits, path, result, map);
            path.deleteCharAt(path.length() - 1);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.letterCombinations("23"));
        System.out.println(solution.letterCombinations("2"));
        System.out.println(solution.letterCombinations(""));
    }
}
