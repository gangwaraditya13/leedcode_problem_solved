import java.util.Arrays;

public class CountingBits {
    public static void main(String[] args){
        SolutionCountingBits countingBits = new SolutionCountingBits();
        System.out.println(Arrays.toString(countingBits.countBits(5)));
    }
}

class SolutionCountingBits {
//    public int[] countBits(int n){
//        int[] res = new int[n+1];
//        for (int i = 0; i <= n; i++) {
//            int length = 0;
//            for (int j = i; j != 0; ) {
//                if( (j&1) == 1){
//                    length++;
//                }
//                j = j >> 1;
//
//            }
//            res[i] = length;
//        }
//
//        return res;
//    }

    public int[] countBits(int n){
        int[] res = new int[n+1];
        res[0] = 0;
        for (int i = 1; i <= n; i++) {
            res[i] = res[i>>1] + (1&i);
        }

        return res;
    }
}
