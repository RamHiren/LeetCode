class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        int i = 0;
        int j= a[0].length-1;
        while(i<a.length && j>=0){
            if(a[i][j]==t){
                return true;
            }else if(a[i][j]<t){
                i++;
            }else{
                j--;
            }
        }

        return false;


    }
}