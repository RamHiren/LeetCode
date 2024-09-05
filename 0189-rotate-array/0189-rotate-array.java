class Solution {
    public void rotate(int[] a, int k) {
        int[] b = new int[a.length];
        int l = a.length;
        int j=0;
        
        

        for (int i = k; i < b.length+k; i++) {
            b[i%a.length]=a[j];
            j++;
        }     

        for(int i=0;i<a.length;i++){
            a[i]=b[i];
        }
        
    }
}