import java.util.HashMap;
import java.util.Hashtable;

public class SortCharactersByFrequency {
    static public void main(String[] args){
        SolutionSortCharactersByFrequency sortCharactersByFrequency = new SolutionSortCharactersByFrequency();
        System.out.println(sortCharactersByFrequency.frequencySort("tree"));
    }
}

class SolutionSortCharactersByFrequency {
    public String frequencySort(String s) {
        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        StringBuilder sb = new StringBuilder();

        for (int k = 0; k < 128; k++) {
            int maxFreq = 0;
            int maxChar = 0;

            for (int i = 0; i < 128; i++) {
                if (freq[i] > maxFreq) {
                    maxFreq = freq[i];
                    maxChar = i;
                }
            }

            if (maxFreq == 0) {
                break;
            }

            for (int j = 0; j < maxFreq; j++) {
                sb.append((char) maxChar);
            }

            freq[maxChar] = 0;
        }

        return sb.toString();
    }

}