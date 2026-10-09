import java.util.Arrays;

public class RotateImage {
    static public void main(String[] args){
        SolutionRotateImage rotateImage = new SolutionRotateImage();
        rotateImage.rotate(new int[][]{{1,2,3},{4,5,6},{7,8,9}});

    }
}

class SolutionRotateImage {
    public void rotate(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        for (int i = 0; i < matrix.length; i++) {
            int j=0;
            int k = matrix[i].length-1;

            while (j <= (matrix[i].length-1) /2){
                int temp = matrix[i][k];
                matrix[i][k] = matrix[i][j];
                matrix[i][j] = temp;
                j++;
                k--;
            }
        }

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}