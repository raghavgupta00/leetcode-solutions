class Solution {
	/*
		Very simple code. Basic knowledge of matrices is required to understand
		the code. Uses the definition of the transpose a matrix, which states
		that the i-th row, j-th column element of A-transpose is the j-th row,
		i-th column element of A. The code works for all matrices, whether
		they are square (i.e. equal number of rows and columns) or not.
	*/
    public int[][] transpose(int[][] A) {
		// Creating a n x m matrix, where A is assumed to be a m x n matrix.
        int[][] transpose = new int[A[0].length][A.length];
        for(int i = 0; i < A[0].length; i++)
        {
            for(int j = 0; j < A.length; j++)
            {
				// Using defintition of transpose.
                transpose[i][j] = A[j][i];
            }
        }
        return transpose;
    }
}