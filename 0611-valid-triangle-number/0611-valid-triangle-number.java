class Solution {
    public int triangleNumber(int[] a) {
        int c=0;
        Arrays.sort(a);
        for(int i=0;i<a.length-2;i++){
            for(int j=i+1;j<a.length-1;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]>a[k] && a[j]+a[k]>a[i] && a[i]+a[k]>a[j]){
                        c++;
                    }
                }
            }
        }

        return c;
    }
}