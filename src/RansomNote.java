public class RansomNote {
    public static void main(String[] args){
        SolutionRansomNote ransomNot = new SolutionRansomNote();
        System.out.println(ransomNot.canConstruct("aa","aab"));

    }
}

class SolutionRansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        for (char c : magazine.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            count[c - 'a']--;

            if (count[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}