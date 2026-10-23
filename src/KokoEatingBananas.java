public class KokoEatingBananas {
    public static void main(String[] args){
        SolutionKokoEatingBananas kokoEatingBananas = new SolutionKokoEatingBananas();
        System.out.println(kokoEatingBananas.minEatingSpeed(new int[]{805306368,805306368,805306368}, 1000000000));
    }
}


class SolutionKokoEatingBananas {
    public int minEatingSpeed(int[] piles, int h) {

        int high = 0, low = 1;
        for (int i=0;i<piles.length;i++){
            high = Math.max(high,piles[i]);
        }
        
        while (low<=high){
            int mid = low + (high - low)/2;
            long time = timeTakenToFinishPiles(piles, mid);
            if( time <= h){
                high = mid-1;
            } else{
                low = mid+1;
            }
        }
        return low;
    }

    static public long timeTakenToFinishPiles(int[] piles, int speed){
        long totalTime = 0;
        for (int i = 0; i < piles.length; i++) {
            int timeToEatAPile = (int) Math.ceil(piles[i]*1.0/speed);
            totalTime += timeToEatAPile;
        }
        return totalTime;
    }
}