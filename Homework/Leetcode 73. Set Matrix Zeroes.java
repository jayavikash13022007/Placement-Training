class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> column = new HashSet<>();
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matrix[i][j] == 0){
                    row.add(i);
                    column.add(j);
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j : column){
                matrix[i][j] = 0;
            }
        }
        for(int j = 0; j < n; j++){
            for(int i : row){
                matrix[i][j] = 0;
            }
        }
    }
}