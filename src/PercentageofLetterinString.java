public class PercentageofLetterinString {
    static public void main(String[] args){
        SolutionPercentageofLetterinString percentageofLetterinString = new SolutionPercentageofLetterinString();
        System.out.println(percentageofLetterinString.percentageLetter("foobar",'o'));
    }
}

class SolutionPercentageofLetterinString {
    public int percentageLetter(String s, char letter) {
        int lCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == letter){
                lCount++;
            }
        }

        double re = (lCount/(double)s.length())*100;

        return (int)re;
    }
}