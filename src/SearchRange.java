public class SearchRange {
    public static void main(String[] args){}
}

class SolutionSR {
    public int[] searchRange(int[] nums, int target) {
        int j =-1;
        int k = -1;
        int p =0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == target){
                if(p == 0) {
                    j = i;
                    p++;
                }
                if(p != 0){
                    k=i;
                }
            }
        }

        return new int[]{j,k};
    }
}
