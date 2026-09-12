public class BinarySearch {
    public static void main(String[] args){
        SolutionBinarySearch binarySearch = new SolutionBinarySearch();
        System.out.println(binarySearch.search(new int[]{5},5));
    }
}

class SolutionBinarySearch {
    public int search(int[] nums, int target) {

        int l = 0;
        int r = nums.length-1;

        int mid = l + (r - l) / 2;

        if(nums[mid] > target){
            r = mid -1;
            return searchd(nums, target,l, r);

        }else if(nums[mid] < target){
            l = mid+1;
            return searchd(nums, target,l, r);
        }else{
            return mid;
        }
    }
    private int searchd(int[] nums, int target,int l, int r) {

        if (l > r) {
            return -1;
        }

        int mid = l + (r - l) / 2;

        if (nums[mid] > target) {
            return searchd(nums, target, l, mid - 1);

        } else if (nums[mid] < target) {
            return searchd(nums, target, mid + 1, r);

        } else {
            return mid;
        }
    }

}