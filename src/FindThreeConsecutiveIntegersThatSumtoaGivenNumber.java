import java.util.Arrays;

public class FindThreeConsecutiveIntegersThatSumtoaGivenNumber {
    public static void main(String[] args){
        SolutionFindThreeConsecutiveIntegersThatSumtoaGivenNumber sumtoaGivenNumber = new SolutionFindThreeConsecutiveIntegersThatSumtoaGivenNumber();
        long[] longs = sumtoaGivenNumber.sumOfThree(32);
        System.out.println(Arrays.toString(longs));
    }
}

class SolutionFindThreeConsecutiveIntegersThatSumtoaGivenNumber {
    public long[] sumOfThree(long num) {

        if(num%3 == 0){
            long a = (num/3)-1;
            long b = a+1;
            long c = a+2;

            return new long[]{a,b,c};

        }else{
            return new long[]{};
        }
    }
}