class Solution {
    public boolean containsDuplicate(int[] a) {
        Arrays.sort(a);

        for(int i=1;i<a.length;i++){
            if(a[i-1]==a[i]) return true;
        }
        return false;
    }
}