import java.util.Hashtable;

public class RomantoInteger {
    public static void main(String[] args){
        SolutionRoman solutionRoman = new SolutionRoman();
        solutionRoman.romanToInt("III");
    }
}

class SolutionRoman{
    public int romanToInt(String s) {

        int integerOfRoman = 0;

        Hashtable<String, Integer> roman = new Hashtable<>();
        roman.put("I",1);
        roman.put("V",5);
        roman.put("X",10);
        roman.put("L",50);
        roman.put("C",100);
        roman.put("D",500);
        roman.put("M",1000);
        roman.put("IV",4);
        roman.put("IX",9);
        roman.put("XL",40);
        roman.put("XC",90);
        roman.put("CD",400);
        roman.put("CM",900);

        int x = s.length()-1;
        while (x >= 0){
            if(x > 0){
            if((s.charAt(x)=='V' || s.charAt(x)=='X' || s.charAt(x)=='L' || s.charAt(x)=='C' || s.charAt(x)=='D' || s.charAt(x)=='M') &&  (s.charAt(x - 1) == 'I' || s.charAt(x - 1) == 'X' || s.charAt(x - 1) == 'C')) {
                        String s1 = "";
                        Character c = s.charAt(x);
                        Character c1 = s.charAt(x - 1);
                        String concat = s1.concat(c1.toString()).concat(c.toString());
                        System.out.println(concat);
                        int i = roman.get(concat);
                        integerOfRoman += i;
                        x--;
                }
                else{
                    Character c = s.charAt(x);
                    int i = roman.get(c.toString());
                    integerOfRoman += i;
                }
            }else{
                Character c = s.charAt(x);
                int i = roman.get(c.toString());
                integerOfRoman += i;
            }
            x--;
        }
        return integerOfRoman;
    }
}
