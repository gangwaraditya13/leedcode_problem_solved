import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public static void main(String[] args){
        SolutionKRadiusSubarrayAverages kRadiusSubarrayAverages = new SolutionKRadiusSubarrayAverages();
        int[] averages = kRadiusSubarrayAverages.getAverages(new int[]{7, 4, 3, 9, 1, 8, 5, 2, 6}, 3);
        System.out.println(Arrays.toString(averages));
    }
}

class SolutionKRadiusSubarrayAverages {
    public int[] getAverages(int[] nums, int k) {

        int i = 0;
        int j = 0;
        int k1 = k;

        int[] avgArr = new int[nums.length];

        for (int l = 0; l < avgArr.length; l++) {
            avgArr[l] = -1;
        }

        if (k == 0) {
            return nums;
        }

        long windowSize = 2L * k + 1;

        if (windowSize > nums.length) {
            return avgArr;
        }

        long sum = 0;

        while (j < windowSize) {
            sum += nums[j];
            j++;
        }

        int avg = (int)(sum / windowSize);
        avgArr[k1] = avg;
        k1++;

        while (j < nums.length) {

            sum += nums[j];
            j++;

            sum -= nums[i];
            i++;

            avg = (int)(sum / windowSize);
            avgArr[k1] = avg;
            k1++;
        }

        return avgArr;
    }
}
