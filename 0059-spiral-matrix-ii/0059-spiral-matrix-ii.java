class Solution {
    public int[][] generateMatrix(int n) {
       int [][] a = new int[n][n];
        int rs = 0;
        int re = a.length-1;
        int cs = 0;
        int ce = a[0].length-1;
        int x = 1;

        while (rs<=re && cs <= ce) {
            for(int i = cs; i<=ce; i++){
                a[rs][i] = x;
                x++;
            }
            rs++;
            for(int i = rs; i<=re; i++){
                a[i][ce] = x;
                x++;
            }
            ce--;
            if(rs<=re){
                for (int i = ce; i >=cs ; i--) {
                    a[re][i] = x;
                    x++;
                }
            }
            re--;

            if(cs<=ce){
                for(int i = re; i>=rs; i--){
                    a[i][cs] = x;
                    x++;
                }
            }
            cs++;
        } 

        return a;
    }
}