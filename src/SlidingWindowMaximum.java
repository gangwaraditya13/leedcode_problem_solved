import java.util.*;

public class SlidingWindowMaximum {
    static public void main(String[] args){
        SolutionSlidingWindowMaximum  slidingWindowMaximum = new SolutionSlidingWindowMaximum();
        System.out.println(Arrays.toString(slidingWindowMaximum.maxSlidingWindow(new int[]{1,3,-1,-3,5,3,6,7},3)));
    }
}

class SolutionSlidingWindowMaximum  {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (k == 1) return nums;

        int i = 0;
        int j = 0;

        Deque<Integer> list = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();

        while (j < k) {

            while (!list.isEmpty() && list.peekLast() < nums[j]) {
                list.pollLast();
            }

            list.addLast(nums[j]);
            j++;
        }

        result.add(list.peekFirst());

        while (j < nums.length) {

            if (!list.isEmpty() && list.peekFirst() == nums[i]) {
                list.pollFirst();
            }

            while (!list.isEmpty() && list.peekLast() < nums[j]) {
                list.pollLast();
            }

            list.addLast(nums[j]);

            i++;
            j++;

            result.add(list.peekFirst());
        }

        int[] re = new int[result.size()];

        for (int l = 0; l < result.size(); l++) {
            re[l] = result.get(l);
        }

        return re;
    }
}