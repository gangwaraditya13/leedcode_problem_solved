public class TrappingRainWater {
    static public void main(String[] args){
        SolutionTrappingRainWater trappingRainWater = new SolutionTrappingRainWater();
        System.out.println(trappingRainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }
}

class SolutionTrappingRainWater {
    public int trap(int[] height) {

        int water =0;
        int i = 0;
        int j = height.length-1;

        int leftMax = 0;
        int rightMax = 0;

        while (i<j){
            if(height[i]>=height[j]){
                if(height[j]>=rightMax){
                    rightMax = height[j];
                }else{
                    water = water + (rightMax - height[j]);
                }
                j--;
            }else{
                if(height[i]>=leftMax){
                    leftMax = height[i];
                }else{
                    water = water + (leftMax - height[i]);
                }
                i++;
            }
        }


        return water;
    }
}