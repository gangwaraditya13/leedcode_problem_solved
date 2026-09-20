public class Numberof1Bits {
    public static void main(String[] args){
        SolutionNumberof1Bits numberof1Bits = new SolutionNumberof1Bits();
        System.out.println(numberof1Bits.hammingWeight(2147483645));
    }
}


class SolutionNumberof1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        for (int i = n; i != 0; i = (i >> 1)) {
            if((i&1) == 1){
                count++;
            }
        }
        return count;
    }
}