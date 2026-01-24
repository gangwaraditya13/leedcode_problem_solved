import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {
    public static void main(String[] args){
        SolutionPascalsII pascals = new SolutionPascalsII();
        System.out.println(pascals.getRow(3));
    }
}

class SolutionPascalsII {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();

        // Initialize row with 1
        for (int i = 0; i <= rowIndex; i++) {
            row.add(1);
        }

        // Update row in place
        // Start from row 2 because row 0 and 1 are already correct
        for (int i = 2; i <= rowIndex; i++) {
            // Update from the end to avoid overwriting needed values
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }

}
