import java.util.Arrays;

public class NumberOfWaysToBuyPensAndPencils {
    public static void main(String[] args){
        SolutionNumberOfWaysToBuyPensAndPencils toBuyPensAndPencils = new SolutionNumberOfWaysToBuyPensAndPencils();
        long l = toBuyPensAndPencils.waysToBuyPensPencils(20, 10, 5);
        System.out.println(l);
    }
}

class SolutionNumberOfWaysToBuyPensAndPencils {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long ways =  0;
        for(int p=0; p*cost1 <= total; p++){
            long rem =  total - (p*cost1);

            ways += (rem/cost2) +1;
        }
        return ways;
    }
}
