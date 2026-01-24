import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static void main(String[] args){
        SolutionPascals pascals = new SolutionPascals();
        System.out.println(pascals.generate(5));
    }
}

class SolutionPascals {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> listArrayList = new ArrayList<>();

        for (int i = 1; i <= numRows; i++) {
            if (i == 1) {
                List<Integer> nums = new ArrayList<>();
                nums.add(1);
                listArrayList.add(nums);
            } else if (i == 2) {
                List<Integer> nums = new ArrayList<>();
                nums.add(1);
                nums.add(1);
                listArrayList.add(nums);
            } else {
                List<Integer> nums = new ArrayList<>();
                List<Integer> prev = listArrayList.get(i - 2);

                nums.add(1);

                for (int j = 1; j < prev.size(); j++) {
                    nums.add(prev.get(j - 1) + prev.get(j));
                }

                nums.add(1);
                listArrayList.add(nums);
            }
        }
        return listArrayList;
    }
}
