import java.util.Arrays;

public class ContainsDuplicate {
    public static void main(String[] args){}
}

class solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int c=0;
        for (int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
