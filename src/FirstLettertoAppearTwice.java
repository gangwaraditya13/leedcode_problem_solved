public class FirstLettertoAppearTwice {
    static public void main(String[] args){
        SolutionFirstLettertoAppearTwice firstLettertoAppearTwice = new SolutionFirstLettertoAppearTwice();
        System.out.println(firstLettertoAppearTwice.repeatedCharacter("abccbaacz"));
    }
}

class SolutionFirstLettertoAppearTwice {
    public char repeatedCharacter1(String s) {
        int i =1;
        while (i<s.length()){
            if(s.charAt(i) == s.charAt(i-1)){
                return s.charAt(i);
            }
            i++;
        }

        return '\0';
    }

    public char repeatedCharacter(String s) {
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a';

            if (seen[index]) {
                return s.charAt(i);
            }

            seen[index] = true;
        }

        return '\0';
    }


}

