import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArraysII {
    public static void main(String[] args){
        SolutionIntersectionofTwoArraysII intersectionofTwoArraysII =  new SolutionIntersectionofTwoArraysII();
        System.out.println(Arrays.toString(intersectionofTwoArraysII.intersect(new int[]{1,2,2,1},new int[]{2,2})));
    }
}

class SolutionIntersectionofTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> rec = new HashMap<>();
        List<Integer> resultAdd = new ArrayList<>();

        if(nums1.length>nums2.length) {
            for (int i = 0; i < nums2.length; i++) {
                rec.put(nums2[i], rec.getOrDefault(nums2[i],0)+1);
            }
            for (int i = 0; i < nums1.length; i++) {
                if(rec.containsKey(nums1[i]) && rec.get(nums1[i])>0){
                    rec.put(nums1[i], rec.get(nums1[i])-1);
                    resultAdd.add(nums1[i]);
                }
            }

        }else{
            for (int i = 0; i < nums1.length; i++) {
                rec.put(nums1[i], rec.getOrDefault(nums1[i],0)+1);
            }
            for (int i = 0; i < nums2.length; i++) {
                if(rec.containsKey(nums2[i]) && rec.get(nums2[i])>0){
                    rec.put(nums2[i], rec.get(nums2[i])-1);
                    resultAdd.add(nums2[i]);
                }
            }
        }

        int[] result = new int[resultAdd.size()];
        for (int i = 0; i < resultAdd.size(); i++) {
            result[i] = resultAdd.get(i);
        }

        return result;

    }
}
