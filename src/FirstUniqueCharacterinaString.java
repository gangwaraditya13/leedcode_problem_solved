import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterinaString {
    static public void main(String[] args){
        SolutionFirstUniqueCharacterinaString firstUniqueCharacterinaString = new SolutionFirstUniqueCharacterinaString();
        firstUniqueCharacterinaString.firstUniqChar("aabb");
    }
}

class SolutionFirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}