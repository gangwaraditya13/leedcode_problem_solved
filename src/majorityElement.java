public class majorityElement {
    public static void main(String[] args){

    }
}

class Solutions {
    public int majorityElement(int[] nums) {
        int m=0;

        if(nums.length == 1){
            return nums[0];
        }
        for (int i = 0; i < nums.length; i++) {
            int c=0;
            for (int j = 0; j < nums.length; j++) {
                if(nums[i] == nums[j]){
                    if(c >= (nums.length-1)/2){
                        m=nums[i];
                        break;
                    }else{
                        c++;
                    }
                }
            }
        }
        return m;
    }
}

//class Solution {
//    public int majorityElement(int[] nums) {
//        int candidate = 0;
//        int count = 0;
//        for (int num : nums) {
//            if (count == 0) {
//                candidate = num;
//            }
//            if (num == candidate) {
//                count = count + 1;
//            } else {
//                count = count - 1;
//            }
//        }
//
//        return candidate;
//    }
//}

//class Solution {
//    public int majorityElement(int[] nums) {
//        int m=0;
//        int i=0;
//        int j =0;
//        int c =0;
//        if(nums.length == 1){
//            return nums[0];
//        }
//        while(i < nums.length || j < nums.length){
//            if(j<nums.length && i<nums.length){
//                if(nums[i] == nums[j]){
//                    c++;
//                }
//                j++;
//            }
//            if(j == nums.length-1){
//                if(c >= (nums.length-1)/2){
//                    m= nums[i];
//                    break;
//                }else {
//                    j=0;
//                    c = 0;
//                    i++;
//                }
//            }
//        }
//        return m;
//    }
//}