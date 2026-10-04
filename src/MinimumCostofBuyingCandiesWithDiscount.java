import java.util.Arrays;

public class MinimumCostofBuyingCandiesWithDiscount {
    static public void main(String[] args){
        SolutionMinimumCostofBuyingCandiesWithDiscount minimumCostofBuyingCandiesWithDiscount = new SolutionMinimumCostofBuyingCandiesWithDiscount();
        System.out.println(minimumCostofBuyingCandiesWithDiscount.minimumCost(new int[]{1,1,1,6,5,7,9,2,2}));
    }
}

class SolutionMinimumCostofBuyingCandiesWithDiscount {
    public int minimumCost(int[] cost) {
        int minCost = 0;
        if(cost.length <= 2){
            for (int i = 0; i < cost.length; i++) {
                minCost += cost[i];
            }
            return minCost;
        }
        Arrays.sort(cost);
        int i;
        for (i = cost.length-3; i > -1; i-=3) {
            minCost+=cost[i+1];
            minCost+=cost[i+2];
        }
        if(cost.length%3 != 0){
            for (int j = 0; j < cost.length%3; j++) {
                System.out.println(j);
                minCost+=cost[j];
            }
        }

        return minCost;
    }
}