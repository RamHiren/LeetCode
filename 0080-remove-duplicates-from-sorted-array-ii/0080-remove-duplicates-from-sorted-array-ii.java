class Solution {
    public int removeDuplicates(int[] a) {

        

       int v = 1;
       int j = 0;
       int b[] = new int[a.length];
       b[0] = a[0];
       int len =1;

       for(int i =0;i<a.length-1;i++){
            if(a[i] == a[i+1] && v !=2){
                v++;
                j++;
                b[j] = a[i+1];
                len++;
            }else if(a[i] != a[i+1]){
                v=1;
                j++;
                b[j] = a[i+1];
                len++;
            }
       } 

        System.out.println(len);
       for(int i=0;i<a.length;i++){
        a[i]=b[i];
       }

       return len;
    }
}