public class NumberofLinesToWriteString {
    static public void main(String[] args){
        SolutionNumberofLinesToWriteString solutionNumberofLinesToWriteString = new SolutionNumberofLinesToWriteString();
        solutionNumberofLinesToWriteString.numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10},"abcdefghijklmnopqrstuvwxyz");

    }
}


class SolutionNumberofLinesToWriteString {
    public int[] numberOfLines(int[] widths, String s) {

        int lines = 1;
        int currentWidth = 0;

        for (char ch : s.toCharArray()) {

            int width = widths[ch - 'a'];

            if (currentWidth + width > 100) {
                lines++;
                currentWidth = width;
            } else {
                currentWidth += width;
            }
        }

        return new int[]{lines, currentWidth};
    }
}