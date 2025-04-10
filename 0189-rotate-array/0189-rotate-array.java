class Solution {
    public void rotate(int[] a, int k) {
        int t[] = new int[a.length];
        int j=0;


        for(int i =k;i<a.length+k;i++){
            t[i%a.length] = a[j++];
        }

        for(int i=0;i<a.length;i++){
            a[i] = t[i];
        }

    }
}