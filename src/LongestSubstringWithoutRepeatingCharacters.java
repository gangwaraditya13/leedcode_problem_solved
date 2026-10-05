import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    static public void main(String[] args){
        SolutionLongestSubstringWithoutRepeatingCharacters longestSubstringWithoutRepeatingCharacters = new SolutionLongestSubstringWithoutRepeatingCharacters();
        System.out.println(longestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    }
}

class SolutionLongestSubstringWithoutRepeatingCharacters  {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> storage = new HashMap<>();
        int max = 0;
        while (j < s.length()){
            storage.put(s.charAt(j),storage.getOrDefault(s.charAt(j),0)+1);
            if(storage.size() == (j-i+1)){
                max = Math.max(max, (j-i+1));
            }else if(storage.size() > (j-i+1)){

            }else{
                while (storage.size() < (j-i+1)) {
                    storage.put(s.charAt(i), storage.getOrDefault(s.charAt(i), 0) - 1);
                    if(storage.get(s.charAt(i)) == 0) {
                        storage.remove(s.charAt(i));
                    }
                    i++;
                }
            }
            j++;
        }
        return max;
    }
}