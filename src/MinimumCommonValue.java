public class MinimumCommonValue {
    public static void main(String[] args){
        SolutionMinimumCommonValue minimumCommonValue = new SolutionMinimumCommonValue();
        System.out.println(minimumCommonValue.getCommon(new int[]{1,2,3,6}, new int[]{2,3,4,5}));
    }
}

class SolutionMinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        int i =0;
        int j= 0;
        int sCommon =-1;
        while (i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                return nums1[i];
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }

        return sCommon;
    }
}