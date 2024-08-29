class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[2*n];
        int m=0;
        int p=0;
        for(int i = 0; i<(2*n);i++){
            if(i<n){               
                a[m]=nums[i];
                m++;
            }else{               
                b[p]=nums[i];
                p++;
            }
        }
        m=0;
        p=0;
        for(int i = 0; i<(2*n);i++){

            if(i%2==0){
                c[i]=a[m];
                m++;
            }else{
                c[i]=b[p];
                p++;
            }
        }
        return c;
    }
}