import java.util.Arrays;

public class MinimumNumberofKConsecutiveBitFlips {
    static public void main(String[] args){
        SolutionMinimumNumberofKConsecutiveBitFlips minimumNumberofKConsecutiveBitFlips = new SolutionMinimumNumberofKConsecutiveBitFlips();
        System.out.println(minimumNumberofKConsecutiveBitFlips.minKBitFlips(new int[]{1,1,0},2));
    }
}

class SolutionMinimumNumberofKConsecutiveBitFlips {
    /// O(n x K) & O(n^2)
    public int minKBitFlipsBrootForce(int[] nums, int k) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0){
                if (i + k > nums.length)
                    return -1;
                for (int j = i; j < (i+k); j++) {
                        if (nums[j] == 0) nums[j] = 1;
                        else nums[j] = 0;
                }
                count++;
            }
        }
        return count;
    }

    /// O(n)
    public int minKBitFlips(int[] nums, int k) {
        int n = nums.length;
        int[] diff = new int[n + 1];

        int flip = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {

            // Apply changes that start/end at this index
            flip += diff[i];

            // Effective value after currently active flips
            int current = nums[i] ^ (flip & 1);

            if (current == 0) {

                // Not enough elements left for a k-length flip
                if (i + k > n) {
                    return -1;
                }

                // Start a new flip
                count++;
                flip++;

                // This flip expires after k elements
                diff[i + k]--;
            }
        }

        return count;
    }
}