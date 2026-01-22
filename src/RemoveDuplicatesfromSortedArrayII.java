import java.util.Arrays;

public class RemoveDuplicatesfromSortedArrayII {
    public static void main(String[] args){
        Solution1 s = new Solution1();
        System.out.println(s.removeDuplicates(new int[]{0,0,1,1,1,1,2,3,3}));
    }
}

class Solution1{
    public int removeDuplicates(int[] nums) {
        int c =0, j=1;
        int i=0;
        while(j<nums.length){
            if(nums[i] == nums[j]){
                c++;
            }else{
                c=1;
            }
            if(c<3){
                nums[i] = nums[j];
                i++;
            }
            j++;
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(nums));
        return nums.length;
    }
}
