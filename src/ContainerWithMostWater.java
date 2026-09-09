import java.util.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args){
        SolutionContainerWithMostWater solutionContainerWithMostWater = new SolutionContainerWithMostWater();
        System.out.println(solutionContainerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
}

class SolutionContainerWithMostWater {
    public int maxArea(int[] height) {

        int i = 0;
        int j = height.length -1;
        int maxAreaV=0;
        while (i<j){
            int width = j-i;
            int cArea = width * Math.min(height[i],height[j]);
            maxAreaV = Math.max(maxAreaV,cArea);
            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }

        return maxAreaV;
    }
}
