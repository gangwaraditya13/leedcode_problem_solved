import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    static public void main(String... args){
        SolutionMinimumAbsoluteDifference minimumAbsoluteDifference = new SolutionMinimumAbsoluteDifference();
        System.out.println(minimumAbsoluteDifference.minimumAbsDifference(new int[]{3,8,-10,23,19,-4,-14,27}));
    }
}

class SolutionMinimumAbsoluteDifference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(arr);
        int minAbs =  arr[1] - arr[0];
        for (int i = 2; i < arr.length; i++) {
            minAbs = Math.min(minAbs, (arr[i] - arr[i-1]));
        }
        for (int i = 0; i < arr.length-1; i++) {
            if((arr[i+1] - arr[i]) == minAbs) {
                List<Integer> subArr = new ArrayList<>();
                subArr.add(arr[i]);
                subArr.add(arr[i+1]);
                result.add(subArr);
            }
        }
        return result;
    }
}