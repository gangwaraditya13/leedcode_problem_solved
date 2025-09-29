import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args){}
}
class SolutionMoZ {
    public void moveZeroes(int[] nums) {
        int i =0;
        int j =0;
        int temp = 0;

        while(j < nums.length){
            if(nums[j] == 0){
                j++;
            }else if(nums[j] != 0 && nums[i] != 0){
                j++;
                i++;
            }
            else if(nums[i] == 0 && nums[j] != 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i++;
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

