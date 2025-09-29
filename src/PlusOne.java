public class PlusOne {
    public static void main(String[] args){}
}

class SolutionPO {
    public int[] plusOne(int[] digits) {
        int l = digits.length+1;
        int[] oneAdd = new int[l];
        oneAdd[0] = 1;
        int c=0;
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                break;
            }else{
                digits[i] = 0;
                c++;
            }
        }
        System.out.println(c);
        if(c <= digits.length-1){
            return digits;
        }else{
            return oneAdd;
        }
    }
}

//class Solution {
//    public int[] plusOne(int[] digits) {
//        long num = 0;
//        int Length =0;
//        int l = digits.length-1;
//        for (int i = 0; i < digits.length; i++) {
//            if(digits[i] == 0) {
//                num = num * 10;
//            }else{
//                num = num * 10 + digits[i];
//            }
//            if(digits[l] == 9){
//                Length = digits.length+1;
//            }else{
//                Length = digits.length;
//            }
//            l--;
//        }
//        int[] oneAdd = new int[Length];
//        System.out.println(digits.length);
//            System.out.println(num);
//        num = num+1;
//            System.out.println(num);
//        for (int i = oneAdd.length-1; i >= 0; i--) {
//            long r = num%10;
//            System.out.println(r);
//            oneAdd[i] = (int) r;
//            num = num/10;
//        }
//        return oneAdd;
//    }
//}