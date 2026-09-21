import java.util.Arrays;

public class FindTheOriginalArrayofPrefixXor {
    public static void main(String[] args){
        SolutionFindTheOriginalArrayofPrefixXor findTheOriginalArrayofPrefixXor = new SolutionFindTheOriginalArrayofPrefixXor();
        System.out.println(Arrays.toString(findTheOriginalArrayofPrefixXor.findArray(new int[]{13})));
    }
}

class SolutionFindTheOriginalArrayofPrefixXor {
    public int[] findArray(int[] pref) {
        int[] ans = new int[pref.length];
        for (int i = 0; i < pref.length; i++) {
            if(i == 0){
                ans[i] = pref[i];
            }else{
                ans[i] = pref[i] ^ pref[i-1];
            }
        }

        return ans;
    }
}