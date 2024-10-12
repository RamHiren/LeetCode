class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        int r=0;
        int c = a[0].length - 1;

        while(r<a.length && c> -1){
            if(a[r][c]==t){
                return true;
            }
            else if(t > a[r][c]){
                r++;
            }else{ //t < a[r][c]
                c--;
            }
        }
        return false; 
    }
}