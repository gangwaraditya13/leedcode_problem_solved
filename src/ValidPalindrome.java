public class ValidPalindrome {
    public static void main(String[] args){
    SolutionValidPalindrome validPalindrome = new SolutionValidPalindrome();
        boolean palindrome = validPalindrome.isPalindrome("0P");
        System.out.println(palindrome);
    }
}


class SolutionValidPalindrome {
    public boolean isPalindrome(String s) {
        String a = "";
        String r = "";
        int l = s.length()-1;
        for (int i=0; i < s.length(); i++, l--){
            if(((int)s.charAt(i) < 91  && (int)s.charAt(i)>64) || ((int)s.charAt(i) < 123  && (int)s.charAt(i)>96) || ((int)s.charAt(i) < 58  && (int)s.charAt(i)>47)){
                Character c = s.charAt(i);
                a = a.concat(c.toString());
            }
            if(((int)s.charAt(l) < 91  && (int)s.charAt(l)>64) || ((int)s.charAt(l) < 123  && (int)s.charAt(l)>96) || ((int)s.charAt(l) < 58  && (int)s.charAt(l)>47)){
                Character c = s.charAt(l);
                r = r.concat(c.toString());
            }
        }

        return a.toLowerCase().equals(r.toLowerCase());
    }
}