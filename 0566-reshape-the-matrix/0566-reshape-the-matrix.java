class Solution {
    public int[][] matrixReshape(int[][] m, int r, int c) {
        if(m.length*m[0].length != r*c){
            return m;
        }
        int[][] a = new int[r][c];
        int[] b = new int[m.length*m[0].length];
    
        for(int i=0;i<m.length;i++){
            for(int j=0;j<m[0].length;j++){
                b[m[0].length*i + j]=m[i][j];
            }
        }

        for(int i=0;i<b.length;i++){  
                a[i/c][i%c]=b[i];
        }
        return a;

    }
}