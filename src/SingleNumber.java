import java.util.Arrays;

public class SingleNumber {
    public static void main(String[] args){}
}


//class Solution {
//    public int singleNumber(int[] nums) {
//        int s=0;
//        for(int i=0; i< nums.length; i++){
//            int c =0;
//            for (int j = 0; j < nums.length; j++) {
//                if(nums[i] == nums[j]){
//                    c++;
//                }
//            }
//            if(c==1){
//                s=nums[i];
//            }
//        }
//        return s;
//    }
//}

class SolutionSN {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1){
            return nums[0];
        }
        for(int i=0;i<nums.length-1;i+=2){
            if(nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}