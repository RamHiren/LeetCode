class Solution {
    public void setZeroes(int[][] a) {
        int r[] = new int[a.length];
        int c[] = new int[a[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==0){
                    r[i]=1;
                    c[j]=1;
                }
            }
        }

        //row
        for(int i=0;i<r.length;i++){
            if(r[i]==1){
                for(int j=0;j<a[i].length;j++){
                    a[i][j]=0;
                }
            }
        }
        
        //col
        for(int j=0;j<c.length;j++){
            if(c[j]==1){
                for(int i=0;i<a.length;i++){
                    a[i][j]= 0;
                }
            }
        }


    }
}   