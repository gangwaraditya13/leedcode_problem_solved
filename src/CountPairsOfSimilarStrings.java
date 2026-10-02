public class CountPairsOfSimilarStrings {
    static public void main(String[] args){
        SolutionCountPairsOfSimilarStrings countPairsOfSimilarStrings = new SolutionCountPairsOfSimilarStrings();
        System.out.println(countPairsOfSimilarStrings.similarPairs(new String[]{"aba","aabb","abcd","bac","aabc"}));
    }
}

class SolutionCountPairsOfSimilarStrings {
    public int similarPairs(String[] words) {
        int matchCount = 0;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {

                boolean[] chars1 = new boolean[26];
                boolean[] chars2 = new boolean[26];

                for (int k = 0; k < words[i].length(); k++) {
                    chars1[words[i].charAt(k) - 'a'] = true;
                }

                for (int k = 0; k < words[j].length(); k++) {
                    chars2[words[j].charAt(k) - 'a'] = true;
                }

                boolean similar = true;

                for (int k = 0; k < 26; k++) {
                    if (chars1[k] != chars2[k]) {
                        similar = false;
                        break;
                    }
                }

                if (similar) {
                    matchCount++;
                }
            }
        }

        return matchCount;
    }

}