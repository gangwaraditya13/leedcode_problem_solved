import java.util.Hashtable;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args){
        SolutionValidAnagram validAnagram = new SolutionValidAnagram();
        System.out.println(validAnagram.isAnagram("rat","car"));
    }
}

class SolutionValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Hashtable<Character, Integer> scatter = new Hashtable<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if(scatter.containsKey(c)) {
                Integer j = scatter.get(c)+1;
                scatter.put(c, j);
            }else{
                scatter.put(c, 1);
            }
        }
        boolean anagram = false;
        for (int i = 0; i < t.length(); i++) {
            Character c = t.charAt(i);
            if(scatter.containsKey(c)){
                Integer j = scatter.get(c)-1;
                scatter.put(c, j);
            }
        }
        for (Map.Entry<Character, Integer> entry : scatter.entrySet()){
            if(entry.getValue() == 0){
                anagram = true;
            }else{
                return false;
            }
        }
        return anagram;
    }
}