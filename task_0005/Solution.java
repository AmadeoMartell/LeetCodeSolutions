package task_0005;

public class Solution {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("jcwwnkwiajicysmdueefqjnrokunucidhgkswbgjkkrujkxkxeanrpjvpliomxztalhmvcldnqmkslkprhgtwlnsnygbzdvtdbsdzsdjggzgmhogknpfhtgjmclrkgfqdbiagwrqqcnagosnqrnpapxfrtrhzlyhszdtgkqggmewqmwugrbufiwfvtjhczqgcwpcyjioeacggiwyinpkyxrpxhglrtojgjmmswxnvirfsrbhmpqgjyyagjqfwkqkjkumywvgfutmiwihwnnhbfxcijaoiyxbdnrckexqfhsmmxflaneccyaoqoxfbaylcvvpfafsikebzcdufvhluldguwsmrtjaljpcjestranfrvgvytozxpcvnwquhnsxlmzkehwopgxvifajmrlwqiqylgxibnypxwpkggxevyfoxywfsfpjbzfxxysgxgwxrzkwdqlkrpajlltzqfqshdokibakkhydizsgwbygqulljqmtxkwepitsukwjlrrmsjptwabtlqytprkkuxtqdmptctkfabxsohrfrqvrbjfbppfkpthosveoppiywkkuoasefviegormlqkqlbhnhblkmglxcbszblfipsyumcrjrkrnzplkveznbtdbtlcptgswhiqsjugqrvujkzuwvoxbjremyxqqzxkgerhgtidsefyemtmstsznvgohexdgetqbhrxaomzsamapxhjibfvtbquhowyrwyxthpwvmfyyqsyibemnfbwkddtyoijzwfxhossylygxmnznpegtgvlrsreepkrcdgbujkghrgtsxwlvxrgrqxnvgqkppbkrxjupjfjcsfzepdemaulfetn"));
    }
    public static String longestPalindrome(String s) {
        int max = 1;
        String str = s.substring(0,1);
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + max ; j <= s.length(); j++) {
                if (j - i > max && isPalindrome(s.substring(i, j))) {
                    max = j - i;
                    str = s.substring(i, j);
                }
            }
        }
        return str;
    }

    public static boolean isPalindrome(String s){
//        StringBuilder builder = new StringBuilder(s);
//        return s.equals(builder.reverse().toString());
//        Time limit exceeded :c 128 / 142 testcases passed
        int i = 0, j = s.length() - 1;
        while (i < j){
            if(s.charAt(i++) != s.charAt(j--)) return false;
        }
        return true;
    }
}
