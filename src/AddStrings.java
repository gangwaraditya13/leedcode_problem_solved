public class AddStrings {
    public static void main(String[] args){
        SolutionAddStrings addStrings = new SolutionAddStrings();
        System.out.println(addStrings.addStrings("11","123"));
    }
}

class SolutionAddStrings {
    public String addStrings(String num1, String num2) {
        StringBuilder sum = new StringBuilder();

        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int current = digit1 + digit2 + carry;

            sum.append(current % 10);
            carry = current / 10;

            i--;
            j--;
        }

        return sum.reverse().toString();
    }
}
