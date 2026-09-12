import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    static public void main(String[] args){
        SolutionDailyTemperatures dailyTemperatures = new SolutionDailyTemperatures();
        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73})));
    }
}

class SolutionDailyTemperatures {
    public int[] dailyTemperaturesBForce(int[] temperatures) {

        int[] result = new int[temperatures.length];
        int i=0;
        int j = 1;
        int day =1;
        while (i<temperatures.length-1 && j<temperatures.length){
            if(temperatures[i]<temperatures[i+1]){
                result[i] = 1;
                i++;
                j++;
            }else{
                if(temperatures[j]>temperatures[i]){
                    result[i] = day;
                    i++;
                    j = i+1;
                    day =1;
                }
                j++;
                day++;
            }
        }

        return result;
    }

    public int[] dailyTemperatures(int[] temperatures) {

        int[] result = new int[temperatures.length];
        Stack<Integer> dayIndex = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {

            while (!dayIndex.isEmpty() &&
                    temperatures[dayIndex.peek()] < temperatures[i]) {

                int previousDay = dayIndex.pop();
                result[previousDay] = i - previousDay;
            }

            dayIndex.push(i);
        }

        return result;
    }

}