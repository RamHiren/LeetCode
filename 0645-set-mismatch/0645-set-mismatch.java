class Solution {
    public int[] findErrorNums(int[] a) {
        int i=0;
        while(i<a.length){
            int correct_i = a[i]-1;
            if(a[i] != a[correct_i]){
                int t = a[i];
                a[i]= a[correct_i];
                a[correct_i]=t;
            }else{
                i++;
            }
        }

        for(int j=0;j<a.length;j++){
            if(a[j] != j+1){
                return new int[] {a[j],j+1};
            }
        }
        return new int[] {-1,-1};
    }
}