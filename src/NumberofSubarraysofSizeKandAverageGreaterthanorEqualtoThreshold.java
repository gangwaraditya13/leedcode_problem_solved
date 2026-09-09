public class NumberofSubarraysofSizeKandAverageGreaterthanorEqualtoThreshold {
    public static void main(String[] args){
        SolutionNumberofSubarraysofSizeKandAverageGreaterthanorEqualtoThreshold greaterthanorEqualtoThreshold = new SolutionNumberofSubarraysofSizeKandAverageGreaterthanorEqualtoThreshold();
        System.out.println(greaterthanorEqualtoThreshold.numOfSubarrays(new int[]{2,2,2,2,5,5,5,8},3,4));
    }
}

class SolutionNumberofSubarraysofSizeKandAverageGreaterthanorEqualtoThreshold {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int i=0;
        int j =0;
        int count=0;
        long sum =0;
        while(j<k){
            sum+=arr[j];
            j++;
        }
        int avg = (int)sum/k;
        if(avg>= threshold){
            count++;
        }

        while (j<arr.length){
            sum+=arr[j];
            j++;
            sum-=arr[i];
            i++;
            avg = (int)sum/k;
            if(avg>= threshold){
                count++;
            }
        }

        return count;
    }
}
