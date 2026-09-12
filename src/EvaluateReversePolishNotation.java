import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static void main(String[] args){
        SolutionEvaluateReversePolishNotation evaluateReversePolishNotation = new SolutionEvaluateReversePolishNotation();
        System.out.println(evaluateReversePolishNotation.evalRPN(new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}

class SolutionEvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        Stack<Integer> cal = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("*") || tokens[i].equals("-") || tokens[i].equals("+") || tokens[i].equals("/")){
                Integer a = cal.pop();
                Integer b = cal.pop();
                if(tokens[i].equals("-")){
                    Integer r = b-a;
                    cal.push(r);
                }else if(tokens[i].equals("+")){
                    Integer r = b+a;
                    cal.push(r);
                }else if(tokens[i].equals("/")){
                    Integer r = b/a;
                    cal.push(r);
                }else{
                    Integer r = b*a;
                    cal.push(r);
                }
            }else{
                cal.push(Integer.parseInt(tokens[i]));
            }
        }


        return cal.peek();
    }
}