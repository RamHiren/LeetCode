class Solution {
    public boolean checkIfExist(int[] a) {
        Arrays.sort(a);
        for(int i=0;i<a.length-1;i++){
            for(int j = i+1;j< a.length;j++){
                if(a[i]== 2*a[j] || a[j] == 2*a[i])
                    return true;
            }
        }
        return false;
    }
}