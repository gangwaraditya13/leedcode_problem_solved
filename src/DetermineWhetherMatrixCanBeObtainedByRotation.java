import java.util.Arrays;

public class DetermineWhetherMatrixCanBeObtainedByRotation {
    static public void main(String[] args){
        SolutionDetermineWhetherMatrixCanBeObtainedByRotation determineWhetherMatrixCanBeObtainedByRotation =new SolutionDetermineWhetherMatrixCanBeObtainedByRotation();
        determineWhetherMatrixCanBeObtainedByRotation.findRotation(new int[][]{{0,0,0},{0,1,0},{1,1,1}}, new int[][]{{1,1,1},{0,1,0},{0,0,0}});
    }
}

class SolutionDetermineWhetherMatrixCanBeObtainedByRotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        int n = mat.length;

        for (int rotation = 0; rotation < 4; rotation++) {
            if (Arrays.deepEquals(mat, target)) {
                return true;
            }

            int[][] rotated = new int[n][n];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    rotated[j][n - 1 - i] = mat[i][j];
                }
            }

            mat = rotated;
        }

        return false;
    }
}