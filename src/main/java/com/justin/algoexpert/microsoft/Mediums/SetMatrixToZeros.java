package com.justin.algoexpert.microsoft.Mediums;

/**
 * @author Justin Mathew @dev_io
 *
 * [[0,1,2,0],
 * [3,4,5,2],
 * [1,3,1,5]]
 *
 * after first step.
 *
 *  * [[0,1,2,0],
 *  * [3,4,5,2],
 *  * [1,3,1,5]]
 *
 *
 */
public class SetMatrixToZeros {

    public static void main(String[] args) {
        int[][] matrix= new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        System.err.println(matrix);
    }
    public static void setZeroes(int[][] matrix) {
        Boolean isCol = false;
        int R = matrix.length;
        int C = matrix[0].length;

        for (int i = 0; i < R; i++) {

            // Since first cell for both first row and first column is the same i.e. matrix[0][0]
            // We can use an additional variable for either the first row/column.
            // For this solution we are using an additional variable for the first column
            // and using matrix[0][0] for the first row.
            if (matrix[i][0] == 0) { // The column for all the rows will be pointing to the first column. So if the first column has a zero, we set isCol to true
                isCol = true;
            }

            for (int j = 1; j < C; j++) { //The reason why we use j=1 is because we are using the first row and first column as our markers. So we skip that.
                // If an element is zero, we set the first element of the corresponding row and column to 0
                if (matrix[i][j] == 0) {
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // Iterate over the array once again and using the first row and first column, update the elements.
        for (int i = 1; i < R; i++) { //Here also we start i = 0  because we are using the first row and first column as our markers. So we skip that.
            for (int j = 1; j < C; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // See if the first row needs to be set to zero as well
        if (matrix[0][0] == 0) { // Since we used matrix[0][0] for both first row and first column, we need to check if the first row needs to be set to zero as well
            for (int j = 0; j < C; j++) {
                matrix[0][j] = 0;
            }
        }

        // See if the first column needs to be set to zero as well
        if (isCol) { // Since we used matrix[0][0] for both first row and first column, we need to check if the first column needs to be set to zero as well
            for (int i = 0; i < R; i++) {
                matrix[i][0] = 0;
            }
        }
    }

}
