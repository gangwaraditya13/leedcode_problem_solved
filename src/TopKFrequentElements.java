import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args){
        SolutionTopKFrequentElements solutionTopKFrequentElements = new SolutionTopKFrequentElements();
        solutionTopKFrequentElements.topKFrequent(new int[]{1,5,2,2,2,2,2,3,3,3,3},2);
    }
}

class SolutionTopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new TreeMap<>();

        int[] arr = new int[k];

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],map.getOrDefault(nums[i], 0) + 1);
        }

        List<int[]> arr1 = new ArrayList<>();

        for (Map.Entry<Integer, Integer> o : map.entrySet()) {
            arr1.add(new int[]{o.getValue(), o.getKey()});
        }

        arr1.sort((a,b) -> b[0] - a[0]);

        for (int i=0; i< k; i++){
            arr[i] = arr1.get(i)[1];
        }

        System.out.println(Arrays.toString(arr));

        return arr;
    }
}

