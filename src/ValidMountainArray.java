public class ValidMountainArray {
    static public void main(String[] args){
        SolutionValidMountainArray validMountainArray = new SolutionValidMountainArray();
        System.out.println(validMountainArray.validMountainArray(new int[]{9,8,7,6,5,4,3,2,1,0}));
    }
}

class SolutionValidMountainArray  {
    public boolean validMountainArray(int[] arr) {
        if(arr.length <= 2){
            return false;
        }
        int k = 0;
        int i;

        for ( i =0 ; i < arr.length-1; i++) {
            if(arr[i] < arr[i+1]){
                k = 0;
            }else if(arr[i] > arr[i+1]){
                k=1;
                break;
            }else{
                return false;
            }
        }
        if(i == 0){
            return false;
        }
        for (int j=i; j < arr.length-1; j++) {
            if(arr[j] > arr[j+1]){
                k=1;
            }else if(arr[j] < arr[j+1]){
                k=0;
                break;
            }else{
                return false;
            }
        }
        if(k==1) {
            return true;
        }else{
            return false;
        }
    }
}