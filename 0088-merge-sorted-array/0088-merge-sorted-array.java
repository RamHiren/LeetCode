class Solution {
    public void merge(int[] a, int m, int[] b, int n) {
        int x=0;
        for(int i =m ; i<a.length;i++){
            a[i]=b[x++];
        }

        Arrays.sort(a);
    }
}