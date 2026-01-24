import java.util.*;

public class IntersectionOf2Array {
    static public void main(String[] args){
        SolutionIntersection intersection = new SolutionIntersection();
        System.out.println(Arrays.toString(intersection.intersection(new int[]{2,1},new int[]{1,1})));
    }
}

class SolutionIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0, j = 0;
        Set<Integer> result = new HashSet<>();

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }

        int[] array = new int[result.size()];
        int k = 0;
        for (int num : result) {
            array[k++] = num;
        }

        return array;
    }
}


class SolutionIntersectionBySet {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();

        // Add all elements from nums1 to set1
        for (int num : nums1) {
            set1.add(num);
        }

        // Check each element in nums2, add to result if exists in set1
        for (int num : nums2) {
            if (set1.contains(num)) {
                result.add(num);
            }
        }

        // Convert set to array
        int[] resArray = new int[result.size()];
        int i = 0;
        for (int num : result) {
            resArray[i++] = num;
        }

        return resArray;
    }
}
