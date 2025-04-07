class Solution {
    public int removeElement(int[] a, int k) {
        int c =0;
        for(int i =0;i<a.length;i++){
            if(a[i]!=k){
                c++;
            }
        }
        int j=0;
        int b[] = new int[c];
        for(int i=0;i<a.length;i++){
            if(a[i]!=k){
                b[j++]=a[i];
            }
        }
        for(int i=0;i<b.length;i++){
            a[i]=b[i];
        }
        return c;
    }
}