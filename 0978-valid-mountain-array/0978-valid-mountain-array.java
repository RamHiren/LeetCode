class Solution {
    public boolean validMountainArray(int[] a) {
        if(a.length<3)return false;
        int i=0;
        for(;i<a.length-1;i++){
            if(a[i]==a[i+1])return false;
            if(a[i]>a[i+1])break;
        }

        if(i==a.length-1||i==0)return false;

        for(;i<a.length-1;i++){
            if(a[i]<=a[i+1])return false;
        }

        return true;
    }
}