import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class MajorityElementII {
    static public void main(String[] args){
        SolutionMajorityElementII majorityElementII = new SolutionMajorityElementII();
        System.out.println(majorityElementII.majorityElement(new int[]{3,2,3,}));
    }
}

class SolutionMajorityElementII {

    //best solution
    public List<Integer> majorityElementbest(int[] nums) {

        HashMap<Integer, Integer> fre = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            fre.put(nums[i], fre.getOrDefault(nums[i],0)+1);
        }

        for (Integer i : fre.keySet().toArray(new Integer[0])){
            if(fre.get(i) > (nums.length)/3){
                res.add(i);
            }
        }

        return res;
    }

    //by  boyer moore algorithm
    public List<Integer> majorityElement(int[] nums) {

        List<Integer> res = new ArrayList<>();

        int count1 = 0, count2 = 0, element1 = Integer.MIN_VALUE, element2 = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if(count1 == 0 && element2 != nums[i]){
                element1 = nums[i];
                count1 = 1;
            }else if(count2==0 && element1 != nums[i]){
                element2 = nums[i];
                count2 = 1;
            }else if(element1 == nums[i]){
                count1++;
            }else if(element2 == nums[i]){
                count2++;
            }else{
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (element1 == num) {
                count1++;
            }
            if (element2 == num) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            res.add(element1);
        }
        if (count2 > nums.length / 3) {
            res.add(element2);
        }

        return res;
    }
}
