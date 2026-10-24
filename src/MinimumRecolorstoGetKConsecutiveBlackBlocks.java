public class MinimumRecolorstoGetKConsecutiveBlackBlocks {
    static public void main(String[] args){
        SolutionMinimumRecolorstoGetKConsecutiveBlackBlocks minimumRecolorstoGetKConsecutiveBlackBlocks = new SolutionMinimumRecolorstoGetKConsecutiveBlackBlocks();
        System.out.println(minimumRecolorstoGetKConsecutiveBlackBlocks.minimumRecolors("WBBWWBBWBW",7));
    }
}

class SolutionMinimumRecolorstoGetKConsecutiveBlackBlocks {
    public int minimumRecolors(String blocks, int k) {
        int minReColor = Integer.MAX_VALUE;
        int count = 0;
        int i=0;
        int j=0;
        while (j<k){
            if(blocks.charAt(j) == 'W'){
                count++;
            }
            j++;
        }
        minReColor = Math.min(minReColor, count);

        while (j<blocks.length()){
            if(blocks.charAt(j) == 'W'){
                count++;
            }
            j++;
            if(blocks.charAt(i) == 'W'){
                count--;
            }
            i++;
            minReColor = Math.min(minReColor, count);
        }

        return minReColor;
    }
}