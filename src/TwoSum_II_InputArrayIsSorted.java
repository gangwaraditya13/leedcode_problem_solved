import java.util.Arrays;

public class TwoSum_II_InputArrayIsSorted {
    public static void main(String[] args){
        SolutionTwoSum_II_InputArrayIsSorted iiInputArrayIsSorted = new SolutionTwoSum_II_InputArrayIsSorted();
        int[] ints = iiInputArrayIsSorted.twoSum(new int[]{-1,0}, -1);
        System.out.println(Arrays.toString(ints));
    }
}

class SolutionTwoSum_II_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;

        while (i < j) {
            int sum = numbers[i] + numbers[j];

            if (sum == target) {
                return new int[]{i + 1, j + 1};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }

        return new int[]{};
    }
}