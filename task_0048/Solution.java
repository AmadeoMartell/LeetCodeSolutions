package task_0048;

class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        int i = 0, j = n - 1;

        while (i < j) {
            for (int k = 0; k < n; k++) {
                int temp = matrix[i][k];
                matrix[i][k] = matrix[j][k];
                matrix[j][k] = temp;
            }
            i++;
            j--;
        }

        for (int k = 0; k < n; k++) {
            for (int l = k + 1; l < n; l++) {
                int temp = matrix[k][l];
                matrix[k][l] = matrix[l][k];
                matrix[l][k] = temp;
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Solution solution = new Solution();
        solution.rotate(matrix);
        for (int[] m : matrix) {
            System.out.println(m[0] + " " + m[1] + " " + m[2]);
        }
    }
    //1 2 3
    //4 5 6
    //7 8 9

    //7 8 9
    //4 5 6
    //1 2 3
}
