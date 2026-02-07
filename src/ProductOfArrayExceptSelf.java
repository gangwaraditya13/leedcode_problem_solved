import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    public static void main(String[] args){
        SolutionProductOfArrayExceptSelf productOfArrayExceptSelf = new SolutionProductOfArrayExceptSelf();
        System.out.println(Arrays.toString(productOfArrayExceptSelf.productExceptSelf(new int[]{-1,1,0,-3,3})));
    }
}

class SolutionProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {

        int[] answer = new int[nums.length];

        int zero = 0;
        int multi = 1;

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                zero++;
            }
        }

        if(zero == 0){
            for (int i = 0; i < nums.length; i++) {
                multi = multi * nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                answer[i] = multi/nums[i];
            }

            return answer;
        } else if (zero == 1) {
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] != 0){
                    multi = multi * nums[i];
                }
            }
            for (int i = 0; i < nums.length; i++) {
                if(nums[i] == 0){
                    answer[i] = multi;
                }
            }
        }else{
            return answer;
        }


        return answer;
    }
}