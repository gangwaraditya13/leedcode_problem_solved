import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumofTwoLists {
    static public void main(String[] args){
        SolutionMinimumIndexSumofTwoLists minimumIndexSumofTwoLists = new SolutionMinimumIndexSumofTwoLists();
        System.out.println(Arrays.stream(minimumIndexSumofTwoLists.findRestaurant(new String[]{"Shogun","Tapioca Express","Burger King","KFC"},new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"})).toList());
    }
}

class SolutionMinimumIndexSumofTwoLists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }

        List<String> result = new ArrayList<>();
        int minSum = Integer.MAX_VALUE;

        for (int j = 0; j < list2.length; j++) {
            String str = list2[j];

            if (map.containsKey(str)) {
                int sum = map.get(str) + j;

                if (sum < minSum) {
                    minSum = sum;
                    result.clear();
                    result.add(str);
                } else if (sum == minSum) {
                    result.add(str);
                }
            }
        }

        return result.toArray(new String[0]);
    }
}
