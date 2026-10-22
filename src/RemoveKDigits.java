import java.util.Stack;

public class RemoveKDigits {
    static public void main(String[] args){
        SolutionRemoveKDigits removeKDigits = new SolutionRemoveKDigits();
        System.out.println(removeKDigits.removeKdigits("10",1));
    }
}

class SolutionRemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < num.length(); i++) {
            int n = num.charAt(i) - '0';

            while (!stack.isEmpty() && k > 0 && stack.peek() > n) {
                stack.pop();
                k--;
            }

            stack.push(n);
        }

        while (k > 0) {
            stack.pop();
            k--;
        }

        while (!stack.isEmpty() && stack.firstElement() == 0) {
            stack.remove(0);
        }

        if (stack.isEmpty()) {
            return "0";
        }

        StringBuilder builder = new StringBuilder();

        for (int digit : stack) {
            builder.append(digit);
        }

        return builder.toString();
    }
}