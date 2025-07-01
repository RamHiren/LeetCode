class Solution {
    public int[] nextGreaterElements(int[] a) {
        int r[] = new int[a.length];
        for(int i=0;i<a.length;i++){
            int e = a[i];
            int j=i+1;
            int f =0;
            while(j< i +a.length){
                if(a[i]<a[j%a.length]){
                    r[i] = a[j%a.length];
                    f=1;
                    break;
                }
                j++;
            }
            if(f==0){
                r[i] = -1; 
            }
        }

        return r;

    }
}