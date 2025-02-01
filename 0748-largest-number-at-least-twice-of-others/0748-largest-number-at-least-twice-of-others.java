class Solution {
    public int dominantIndex(int[] a) {
        int max =a[0];
        int ans =0;

        for(int i=0;i<a.length;i++){
           if(max<a[i]){
            max = a[i];
            ans =i;
           }
          
        }
        System.out.print(ans);
        for(int i =0;i<a.length;i++){
           
            if(a[i]*2 > max && a[i] != max){
                return -1;
            }
        }
        return ans;
    }
}