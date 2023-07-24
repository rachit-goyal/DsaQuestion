import java.util.Arrays;

public class SearchIn2DMatrix {


    public static boolean index(int[][] matrix, int target) {

        int i = 0;
        int j = matrix[0].length - 1;
        while (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length) {
            if (matrix[i][j] == target) {

                return true;
            } else if (matrix[i][j] > target) {
                j--;
            } else if (matrix[i][j] < target) {
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[][] arr = {{10, 20, 30, 40}, {15, 25, 35, 45}, {27, 29, 37, 48}, {32, 33, 39, 50}};
        System.out.println(SearchIn2DMatrix.index(arr, 32));
    }
}