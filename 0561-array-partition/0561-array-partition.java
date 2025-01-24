class Solution {
    public int arrayPairSum(int[] a) {
       Arrays.sort(a);
       int min =0;
       for(int i=0;i<a.length;i+=2){
            min +=a[i];
       }
       return min;
    }
}