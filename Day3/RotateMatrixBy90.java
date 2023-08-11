class Solution {
    public void rotate(int[][] matrix) {
     // first transpose the matrix
     int n = matrix.length;
     int result[][]= new int[n][n];
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            result[i][j]=matrix[j][i];
         }
     }
     for(int i=0;i<n;i++){
         int k=0;
         for(int j=n-1;j>=0;j--){
            matrix[i][k]=result[i][j];
             k++;
         }
     }
     

    }

}