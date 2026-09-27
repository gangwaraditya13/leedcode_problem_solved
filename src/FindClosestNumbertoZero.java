import java.util.Hashtable;

public class FindClosestNumbertoZero {
    static public void main(String[] args){
        SolutionFindClosestNumbertoZero findClosestNumbertoZero = new SolutionFindClosestNumbertoZero();
        System.out.println(findClosestNumbertoZero.findClosestNumber(new int[]{-4,-2,1,4,8}));
    }
}

class SolutionFindClosestNumbertoZero {
    public int findClosestNumber(int[] nums) {

        int closest = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest) ||
                    (Math.abs(num) == Math.abs(closest) && num > closest)) {
                closest = num;
            }
        }

        return closest;
    }
}