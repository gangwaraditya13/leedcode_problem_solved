public class ConverttoBase_2 {
    static public void main(String[] args){
        SolutionConverttoBase_2 solutionConverttoBase_2 = new SolutionConverttoBase_2();
        System.out.println(solutionConverttoBase_2.baseNeg2(4));
    }
}

/// it base -2 number not base 2 number
class SolutionConverttoBase_2 {

    /// for base 2
    public String basePos2(int n) {
        StringBuilder binary = new StringBuilder();
        while (n != 0){
            binary.append(n&1);
            n = n>>1;
        }

        return binary.reverse().toString();
    }

    /// for base -2

    public String baseNeg2(int n) {
        if (n == 0) {
            return "0";
        }
        StringBuilder binary = new StringBuilder();

        while (n != 0){
            int r = n &1;
            binary.append(r);
            n = (r - n)>>1;
        }

        return binary.reverse().toString();
    }
}