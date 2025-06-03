class Solution {
    public void rotate(int[][] a) {
        int [][] b= new int[a.length][a.length];

        for(int k=0;k<a.length;k++){
            int [] t = new int [a.length];
            for(int i=0;i<a.length;i++){
                t[i] = a[k][i];
            }

            for(int i=0;i<a.length;i++){
                b[i][a.length-1-k]=t[i];
            }
        }

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                a[i][j] = b[i][j];
            }
        }
     
    }
}