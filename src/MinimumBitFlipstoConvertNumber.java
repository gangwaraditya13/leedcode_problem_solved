public class MinimumBitFlipstoConvertNumber {
    static public void main(String[] args){
        SolutionMinimumBitFlipstoConvertNumber minimumBitFlipstoConvertNumber = new SolutionMinimumBitFlipstoConvertNumber();
        System.out.println(minimumBitFlipstoConvertNumber.minBitFlips(10, 7));

    }
}

class SolutionMinimumBitFlipstoConvertNumber {
    public int minBitFlips(int start, int goal) {
        int flip = 0;
        if(start == goal) return 0;
        while (start!= 0 || goal != 0){
            if((start&1) != (goal&1)) flip++;
            start = start >> 1;
            goal = goal >> 1;
        }
        return flip;
    }
}
