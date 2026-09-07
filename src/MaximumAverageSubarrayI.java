public class MaximumAverageSubarrayI {
    public static void main(String[] args){
        SolutionMaximumAverageSubarrayI maximumAverageSubarrayI = new SolutionMaximumAverageSubarrayI();
        double maxAverage = maximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        System.out.println(maxAverage);
    }
}

class SolutionMaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        double avg = 0;
        int sum = 0;
        int i = 0;
        int j = 0;

        while (j < k) {
            sum += nums[j];
            j++;
        }
        avg = (double) sum / k;

        while (j < nums.length) {
            sum -= nums[i];
            i++;

            sum += nums[j];
            j++;

            double currentAvg = (double) sum / k;
            if (currentAvg > avg) {
                avg = currentAvg;
            }
        }

        return avg;
    }
}
