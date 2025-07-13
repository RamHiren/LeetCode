class Solution {
    public boolean searchMatrix(int[][] a, int t) {
        int i=a.length-1;
        int j=0;

        while(i>=0 && j<a[0].length){
            if(t==a[i][j])return true;

            if(a[i][j]<t){
                j++;
            }else{
                i--;
            }
        }
        return false;

    }
}