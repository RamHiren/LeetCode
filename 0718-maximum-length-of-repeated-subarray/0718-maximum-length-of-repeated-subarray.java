class Solution {
    public int findLength(int[] n1, int[] n2) {
       int a[][] = new int [n1.length+1][n2.length+1];
       int max=0;

       for(int i=1;i<=n1.length;i++){
        for(int j=1;j<=n2.length;j++){
            if(n1[i-1]==n2[j-1]){
                a[i][j]=a[i-1][j-1]+1;
                max = Math.max(a[i][j],max);
            }
        }
       }
       return max;

    }
}