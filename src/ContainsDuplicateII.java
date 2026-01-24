import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] arsg){
        SolutionDuplicate duplicate = new SolutionDuplicate();
        duplicate.containsNearbyDuplicate(new int[]{1,2,3,1},3);
    }
}



class SolutionDuplicate {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }

        return false;
    }
}
