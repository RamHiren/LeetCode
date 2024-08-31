class Solution {
    public int diagonalSum(int[][] a) {
        int l = a.length/2;
        int c = 0;
        int sum=0;
        for(int i =0; i<a.length;i++){
            for(int j =0; j<a.length;j++){
                if(i == j|| (i+j)==a.length-1){
                    if(i==l&&j==l){
                            if(c==0){
                                sum+=a[i][j];
                                c++;
                            }            
                    }else{         
                    sum+=a[i][j];
                    }
                }
            }
        }
        return sum;
    }
}