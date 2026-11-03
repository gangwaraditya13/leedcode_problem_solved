public class SumMultiples {
    static public void main(String[] args){
        SolutionSumMultiples sumMultiples = new SolutionSumMultiples();
        System.out.println(sumMultiples.sumOfMultiples(7));
    }
}

class SolutionSumMultiples {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if(((i%3) == 0) || ((i%5) == 0) || ((i%7) == 0) ){
                sum += i;
            }
        }
        return sum;
    }
}