import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args){
        SolutionReverseString solutionReverseString = new SolutionReverseString();
        solutionReverseString.reverseString(new char[]{'h','e','l','l','o','i'});
    }
}

class SolutionReverseString {
    public void reverseString(char[] s) {
        int j = s.length-1;
            for (int i = 0; i <= (s.length/2)-1; i++,j--) {
                char c = s[j];
                s[j] = s[i];
                s[i] = c;
            }
            System.out.println(Arrays.toString(s));

    }
}