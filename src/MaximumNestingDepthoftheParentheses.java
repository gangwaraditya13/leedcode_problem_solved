import java.util.ArrayDeque;
import java.util.Deque;

public class MaximumNestingDepthoftheParentheses {
    static public void main(String[] args){
        SolutionMaximumNestingDepthoftheParentheses maximumNestingDepthoftheParentheses = new SolutionMaximumNestingDepthoftheParentheses();
        System.out.println(maximumNestingDepthoftheParentheses.maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}

class SolutionMaximumNestingDepthoftheParentheses  {
    public int maxDepth(String s) {
        int depth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
                maxDepth = Math.max(maxDepth, depth);
            } else if (ch == ')') {
                depth--;
            }
        }

        return maxDepth;
    }
}