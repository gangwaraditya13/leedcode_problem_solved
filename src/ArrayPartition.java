import java.util.Arrays;

public class ArrayPartition {
    static public void main(String[] args){
        SolutionArrayPartition arrayPartition = new SolutionArrayPartition();
        System.out.println(arrayPartition.arrayPairSum(new int[]{1,4,3,2}));
    }
}

class SolutionArrayPartition {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);

        int sum = 0;

        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }
}