public class BestTimeToBuyAndSellStock {
    static public void main(String[] args){
        SolutionBestTimeToBuyAndSellStock bestTimeToBuyAndSellStock = new SolutionBestTimeToBuyAndSellStock();
        System.out.println(bestTimeToBuyAndSellStock.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}

class SolutionBestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }

}