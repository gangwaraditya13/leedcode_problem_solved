import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args){}
}


//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//
//        List<List<Integer>>  finalList = new ArrayList();
//        List tro = new ArrayList();
//
//
//
//
//        for(int l = 0; l < (nums.length -2); l++) {
//            int i=l,j=l+1,k=l+2;
//            int a = nums[l];
//            int b = nums[l + 1];
//            int c = nums[l + 2];
//
//                int sum = 0;
//                for (int n = 0; n < nums.length; n++) {
//                    a = nums[n];
//                    if (n != j && j != k && k != n) {
//                        sum = a + b + c;
//                        if (sum == 0) {
//                            tro.add(a);
//                            tro.add(b);
//                            tro.add(c);
//                            boolean exists = false;
//                            for(List<Integer> exist : finalList){
//                                if(exist.get(0) == a && exist.get(1) == b && exist.get(2) == c){
//                                    exists = true;
//                                    break;
//                                }
//                            }
//                            if(!exists) {
//                                finalList.add(tro);
//                            }
//                            tro = new ArrayList<>();
//                        }
//                    }
//                }
//                for (int o = 0; o < nums.length; o++) {
//                    b = nums[o];
//                    if (i != o && o != k && k != i) {
//                        sum = a + b + c;
//                        if (sum == 0) {
//                            tro.add(a);
//                            tro.add(b);
//                            tro.add(c);
//                            boolean exists = false;
//                            for(List<Integer> exist : finalList){
//                                if(exist.get(0) == a && exist.get(1) == b && exist.get(2) == c){
//                                    exists = true;
//                                    break;
//                                }
//                            }
//                            if(!exists) {
//                                finalList.add(tro);
//                            }
//                            tro = new ArrayList<>();
//                        }
//                    }
//
//                }
//                for (int h = 0; h < nums.length; h++) {
//                    c = nums[h];
//                    if (i != j && j != h && h != i) {
//                        sum = a + b + c;
//                        if (sum == 0) {
//                            tro.add(a);
//                            tro.add(b);
//                            tro.add(c);
//                            boolean exists = false;
//                            for(List<Integer> exist : finalList){
//                                if(exist.get(0) == a && exist.get(1) == b && exist.get(2) == c){
//                                    exists = true;
//                                    break;
//                                }
//                            }
//                            if(!exists) {
//                                finalList.add(tro);
//                            }
//                            tro = new ArrayList<>();
//                        }
//                    }
//                }
//        }
//        return  finalList;
//    }
//}

//class Solution {
//    public List<List<Integer>> threeSum(int[] nums) {
//        List<List<Integer>> finalList = new ArrayList<>();
//
//        for(int i = 0; i < nums.length - 2; i++) {
//            for(int j = i + 1; j < nums.length - 1; j++) {
//                for(int k = j + 1; k < nums.length; k++) {
//                    int a = nums[i];
//                    int b = nums[j];
//                    int c = nums[k];
//
//                    if (a + b + c == 0) {
//                        if (a > b) { int t = a; a = b; b = t; }
//                        if (b > c) { int t = b; b = c; c = t; }
//                        if (a > b) { int t = a; a = b; b = t; }
//
//                        List<Integer> tro = new ArrayList<>();
//                        tro.add(a);
//                        tro.add(b);
//                        tro.add(c);
//
//                        boolean exists = false;
//                        for(List<Integer> exist : finalList){
//                            if(exist.get(0) == a && exist.get(1) == b && exist.get(2) == c){
//                                exists = true;
//                                break;
//                            }
//                        }
//
//                        if(!exists) {
//                            finalList.add(tro);
//                        }
//                    }
//                }
//            }
//        }
//        return finalList;
//    }
//}

//most optimize
class SolutionThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> finalList = new ArrayList<>();
        List temp = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0; i<n;i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int j = i+1;
            int k = n-1;
            while (j<k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);

                    finalList.add(temp);
                    temp = new ArrayList<>();
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                }
            }
        }

        return  finalList;
    }
}
