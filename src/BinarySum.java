public class BinarySum {

    public static void main(String[] args){
        SolutionBinarySum binarySum = new SolutionBinarySum();
        System.out.println(binarySum.addBinary("11","1"));
    }
}

class SolutionBinarySum {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            sb.append(sum % 2);
            carry = sum / 2;
        }

        return sb.reverse().toString();
    }
}