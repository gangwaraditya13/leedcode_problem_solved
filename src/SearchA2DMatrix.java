public class SearchA2DMatrix {
    static public void main(String[] args){
//        SolutionSearch2D search2D = new SolutionSearch2D();
//        boolean b = search2D.searchMatrix(new int[][]{{1, 3, 5, 7}}, 3);
//        System.out.println(b);

//        SolutionSearch2DBinarySearch search = new SolutionSearch2DBinarySearch();
//        System.out.println(search.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 20));

        FlattenedBinarySearch flattenedBinarySearch = new FlattenedBinarySearch();
        System.out.println(flattenedBinarySearch.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}}, 20));
    }
}

class SolutionSearch2D {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length -1;
        while(c >= 0 && r < matrix.length){
            if(matrix[r][c] == target){
                System.out.println(matrix[r][c]);
                return true;
            } else if (matrix[r][c] < target) {
                System.out.println("r++ :"+matrix[r][c]);
                r++;
            }else{
                System.out.println("c-- :"+matrix[r][c]);
                c--;
            }
        }
        return false;
    }
}


class SolutionSearch2DBinarySearch {
    static boolean binarySearch(int[][] matrix, int row, int sColumn, int eColumn, int target){
        while (sColumn <= eColumn){
            int mid = sColumn + (eColumn - sColumn)/2;
            if(matrix[row][mid] == target) {
                return true;
            } else if (matrix[row][mid] < target) {
                sColumn = mid +1;
            }else{
                eColumn = mid -1;
            }
        }
        return false;
    }

    public boolean searchMatrix(int[][] matrix, int target) {// its Time complex == O(log m + log n)
        int r = matrix.length;
        int c = matrix[0].length;

        if(r == 1){
            return binarySearch(matrix, 0, 0, (matrix[0].length-1), target);
        }
        int sRow = 0;
        int eRow = r-1;
        int midC = c/2;

        while (sRow < (eRow -1)){
            int mid = sRow + (eRow -sRow)/2;
            if(matrix[mid][midC] == target){
                return true;
            } else if (matrix[mid][midC] < target) {
                sRow = mid;
            }else{
                eRow = mid;
            }
        }

        if(matrix[sRow][midC] == target){
            return true;
        }
        if(matrix[sRow+1][midC] == target){ // here eRow become sRow+1 because the number of remaining row are 2
            return true;
        }

        // 1st quadrant (top-left)
        if (target <= matrix[sRow][midC - 1]) {
            return binarySearch(matrix, sRow, 0, midC - 1, target);
        }
        // 2nd quadrant (top-right)
        if (target >= matrix[sRow][midC + 1] && target <= matrix[sRow][c - 1]) {
            return binarySearch(matrix, sRow, midC + 1, c - 1, target);
        }
        // 3rd quadrant (bottom-left)
        if (target <= matrix[sRow + 1][midC - 1]) {
            return binarySearch(matrix, sRow + 1, 0, midC - 1, target);
        }
        // 4th quadrant (bottom-right)
        return binarySearch(matrix, sRow + 1, midC + 1, c - 1, target);

    }
}

class FlattenedBinarySearch{// its Time complex == O(log(m*n))

    public boolean searchMatrix(int[][] matrix, int target) {
        int LB = 0;
        int UB = (matrix.length * matrix[0].length) -1;
        int m = matrix[0].length;

        while (LB <= UB){
            int mid = LB + (UB - LB)/2;
            int row = mid/m;
            int col = mid%m;
            if(matrix[row][col] == target){
                return true;
            }else if (matrix[row][col] < target){
                LB = mid +1;
            }else{
                UB = mid -1;
            }
        }
        return false;
    }

}