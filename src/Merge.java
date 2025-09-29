import java.util.Arrays;

public class Merge {
    public static void main(String[] args){}
}
class SolutionM {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1;
        int p2 = n - 1;
        int p = m + n - 1;

        while (p2 >= 0) {
            if (p1 >= 0 && nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}

//class Solution {
//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int t=m+n;
//        int i=0;
//        int j=0;
//        int k=0;
//        int temp =0;
//        int temp2 = 0;
//        boolean c =false;
//        while(i<t) {
//            if (t==1) {
//                if (n == 1) {
//                    nums1[0] = nums2[0];
//                }
//                break;
//            } else {
//                if (j < m || k < n) {
//                    if (!c) {
//                        temp = nums1[j];
//                    }
//                    if (temp <= nums2[k] && j < m) {
//                        nums1[i] = temp;
//                        c = false;
//                        i++;
//                        j++;
//                    } else if (nums1[j] >= nums2[k] && k < n) {
//                        temp = nums1[j];
//                        c = true;
//                        nums1[i] = nums2[k];
//                        i++;
//                        k++;
//                    } else {
//                        if (j < m) {
//                            nums1[i] = nums1[j];
//                            j++;
//                            i++;
//                        } else {
//                            nums1[i] = nums2[k];
//                            k++;
//                            i++;
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(Arrays.toString(nums1));
//    }
//}
