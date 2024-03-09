/*867. Transpose Matrix
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.
Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

Constraints:
m == matrix.length
n == matrix[i].length
1 <= m, n <= 1000
1 <= m * n <= 105
-109 <= matrix[i][j] <= 109

Approach:
We can solve this problem by iterating through the matrix and constructing a new matrix where the rows become columns and vice versa.

Steps to solve the problem:
Initialize a new matrix with dimensions n x m where m is the number of rows in the original matrix and n is the number of columns.
Iterate through the original matrix:
For each element matrix[i][j], assign it to newMatrix[j][i] in the transposed matrix.
Return the transposed matrix.

Time Complexity:
The time complexity of the algorithm is O(m * n) since we iterate through all elements of the matrix once to construct the transposed matrix.

Space Complexity:
The space complexity of the algorithm is O(m * n) since we use additional space to store the transposed matrix.
*/
public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        //dimension of original matrix
        int m = matrix.length; //row
        int n = matrix[0].length; //col

        int[][] transposeMatrix = new int[n][m]; //here row becomes col and col becomes row

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                transposeMatrix[j][i] = matrix[i][j];
            }
        }
        return transposeMatrix;
    }
    
}
