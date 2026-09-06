public class CountIntegersWithEvenDigitSum {
    public static void main(String[] args){
        SolutionCountIntegersWithEvenDigitSum integersWithEvenDigitSum = new SolutionCountIntegersWithEvenDigitSum();
        System.out.println(integersWithEvenDigitSum.countEven(2));
    }
}

class SolutionCountIntegersWithEvenDigitSum {
    public int countEven(int num) {
        int count = 0;
        if(num == 1){
            return count;
        }else{
            for (int i = 2; i <= num; i++) {
                    int j = i, sum =0;
                    while (j>0){
                        int rem = j%10;
                        sum+=rem;
                        j/=10;
                    }
                    if(sum%2==0){
                        count++;
                    }
            }
            return count;
        }
    }
}
