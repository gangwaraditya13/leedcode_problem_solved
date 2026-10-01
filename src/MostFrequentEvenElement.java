import java.util.HashMap;

public class MostFrequentEvenElement {
    static public void main(String[] args){
        SolutionMostFrequentEvenElement mostFrequentEvenElement = new SolutionMostFrequentEvenElement();
        System.out.println(mostFrequentEvenElement.mostFrequentEven(new int[]{4,4,4,9,2,4}));
    }
}

class SolutionMostFrequentEvenElement {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer, Integer> frequ = new HashMap<>();

        for (int num : nums) {
            if ((num & 1) == 0) {
                frequ.put(num, frequ.getOrDefault(num, 0) + 1);
            }
        }

        int minKey = -1;
        int max = 0;

        for (Integer num : frequ.keySet()) {
            if (frequ.get(num) > max) {
                max = frequ.get(num);
                minKey = num;
            } else if (frequ.get(num) == max) {
                minKey = Math.min(num, minKey);
            }
        }

        return minKey;
    }
}