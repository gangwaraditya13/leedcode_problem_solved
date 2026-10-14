import java.util.ArrayList;
import java.util.List;

public class AddtoArray_FormofInteger {
    static public void main(String[] args){
        SolutionAddtoArray_FormofInteger addtoArrayFormofInteger = new SolutionAddtoArray_FormofInteger();
        System.out.println(addtoArrayFormofInteger.addToArrayForm(new int[]{9,9,9,9,9,9,9,9,9,9},1));
    }
}

class SolutionAddtoArray_FormofInteger {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int i = num.length - 1;

        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }

            result.add(k % 10);
            k /= 10;
        }

        return result.reversed();
    }
}