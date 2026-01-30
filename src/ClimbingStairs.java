public class ClimbingStairs {
    public static void main(String[] args){
        SolutionClimbingStairs climbingStairs = new SolutionClimbingStairs();
        climbingStairs.climbStairs(5);
    }
}

class SolutionClimbingStairs {
    public int climbStairs(int n) {
        if(n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        int pre = 1;
        int totalSteps = 2;
        for (int i = 3; i < n+1; i++) {
            int temp = totalSteps;
            totalSteps = totalSteps + pre;
            pre = temp;
        }
        return totalSteps;
    }
}