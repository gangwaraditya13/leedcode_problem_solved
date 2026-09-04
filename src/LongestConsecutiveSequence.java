import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public static void main(String[] args){
        SolutionLongestConsecutiveSequence sequence = new SolutionLongestConsecutiveSequence();
        sequence.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0});
    }
}

class SolutionLongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {

        Set<Integer> dup = new HashSet<>();

        for (int num : nums) {
            dup.add(num);
        }


        System.out.println(dup);

        int longest = 0;

        for (int num : dup) {

            if (!dup.contains(num - 1)) {

                int current = num;
                int count = 1;

                while (dup.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}
