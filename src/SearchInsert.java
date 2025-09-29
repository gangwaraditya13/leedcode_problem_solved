public class SearchInsert {
    public static void main(String[] args){}
}

class SolutionSI {
    public int searchInsert(int[] nums, int target) {
        int j=0;
        if(nums[nums.length-1] < target) {
            return nums.length;
        }
        if(nums[0]> target){
            return j;
        }
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > target) {
                    j = i - 1;
                    break;
                } else if (nums[i] < target && nums[i + 1] > target && i < nums.length) {
                    j = i + 1;
                    break;
                } else {
                    j = i;
                }
            }
        return j;
    }
}