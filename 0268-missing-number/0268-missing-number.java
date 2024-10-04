class Solution {
    public int missingNumber(int[] a) {
        Arrays.sort(a);
        int i =0;
       while(i<a.length){
        if(i!=a[i])
            return i;
        i++;
       }
        return i;
    }
}