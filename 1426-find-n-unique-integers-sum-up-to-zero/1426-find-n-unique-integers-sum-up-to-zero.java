class Solution {
    public int[] sumZero(int n) {
        int[] a =new int[n];
        if(n%2!=0){
            a[0] =0;
            for(int i=1;i<=(a.length/2);i++){
                a[i]= i;
                a[a.length-i]= -i;
            }
        }else{
            for(int i = 1; i<=(a.length)/2;i++){
                a[i-1]= i;
                a[a.length-i]= -i;
            }
        }
        return a;
    }
}