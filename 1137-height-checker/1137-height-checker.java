class Solution {
    public int heightChecker(int[] a) {
        int[] b = a.clone();
        int c=0;

        Arrays.sort(b);
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                c++;
            }
        }
        return c;
    }
}