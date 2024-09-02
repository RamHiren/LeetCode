class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
         ArrayList<Integer> c =new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            int k = 0;
            int min=matrix[i][0];
            int max = 0;
            for (int j = 0; j < matrix[i].length; j++) {
               if(matrix[i][j]<min){
                   min = matrix[i][j];
                    k= j;
                   max = matrix[i][j];
               }

            }
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[j][k]>max){
                    max = matrix[j][k];
                }

            }

            if(max==min){
                c.add(max);
            }

         }
        
             return c;
    }
}