import java.util.Arrays;

public class MaximumNestingDepthofTwoValidParenthesesStrings {
    static public void main(String[] args){
        SolutionMaximumNestingDepthofTwoValidParenthesesStrings maximumNestingDepthofTwoValidParenthesesStrings = new SolutionMaximumNestingDepthofTwoValidParenthesesStrings();
        System.out.println(Arrays.toString(maximumNestingDepthofTwoValidParenthesesStrings.maxDepthAfterSplit("()(())()")));
    }
}

class SolutionMaximumNestingDepthofTwoValidParenthesesStrings {
    public int[] maxDepthAfterSplit(String seq) {
        int[] result = new int[seq.length()];
        int maxDepth = 0;
        int dep = 0;
        for (int i =0; i<seq.length();i++){
            if(seq.charAt(i) == '('){
                dep++;
                maxDepth = Math.max(dep,maxDepth);
            }
            else{
                dep--;
            }
        }

        int groupDivide = maxDepth/2;

        System.out.println(maxDepth);
        dep = 0;
        for (int j =0; j< seq.length();j++) {
            if (seq.charAt(j) == '(') {
                dep++;
                result[j] = dep<=groupDivide?0:1;
            } else {
                result[j] = dep<=groupDivide?0:1;
                dep--;
            }
        }

        return result;
    }
}