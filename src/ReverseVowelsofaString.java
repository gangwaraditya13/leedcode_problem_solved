import java.util.ArrayList;
import java.util.List;

public class ReverseVowelsofaString {
    static public void main(String[] args){
        SolutionReverseVowelsofaString reverseVowelsofaString = new SolutionReverseVowelsofaString();
        System.out.println(reverseVowelsofaString.reverseVowels("IceCreAm"));
    }
}

class SolutionReverseVowelsofaString  {
    public String reverseVowels(String s) {
        List<Character> characterList = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
                characterList.add(s.charAt(i));
            }
        }

        int j = characterList.size()-1;

        String rev = "";

        for (int i = 0 ; i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='A' || s.charAt(i)=='e' || s.charAt(i)=='E' || s.charAt(i)=='i' || s.charAt(i)=='I' || s.charAt(i)=='o' || s.charAt(i)=='O' || s.charAt(i)=='u' || s.charAt(i)=='U'){
                rev = rev+characterList.get(j);
                j--;
            }else {
                rev = rev + s.charAt(i);
            }
        }

        return rev;
    }
}