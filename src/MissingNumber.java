public class MissingNumber {
    public static void main(String[] args){
        SolutionMissingNumber missingNumber = new SolutionMissingNumber();
        System.out.println(missingNumber.missingNumber(new int[]{3,0,1}));
    }
}

class SolutionMissingNumber {
    public int missingNumber(int[] nums) {
        int sum =0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        int MissNum = ((n*(n+1))/2) - sum;
        return MissNum;
    }
}