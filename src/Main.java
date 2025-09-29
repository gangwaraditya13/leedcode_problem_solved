import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        Solution obj = new Solution();
        System.out.println(Arrays.toString(obj.intersection(new int[]{1,2,2,1},new int[]{2,2})));
    }
}


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int i=0,j=0;
        Set<Integer> intersection = new HashSet<>();
        while(i < nums1.length){
            if(j < nums2.length){
                if(nums1[i] == nums2[j]){
                    intersection.add(nums1[i]);
                    j++;
                }else{
                    j++;
                }
            }else{
                i++;
                j=0;
            }
        }
        if(intersection.size() > 0) {
            int[] finaluni = new int[intersection.size()];
            int k = 0;
            for (int u : intersection) {
                finaluni[k] = u;
                k++;
            }
        return finaluni;
        }
        return new int[]{};
    }
}







