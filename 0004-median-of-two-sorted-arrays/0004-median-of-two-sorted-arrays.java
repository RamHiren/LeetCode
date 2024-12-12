class Solution {
    public double findMedianSortedArrays(int[] n, int[] m) {
         int[] a = new int[n.length+ m.length]; 
    int i = 0, j = 0;
    for(int k = 0; k < a.length; k++){
        if(i==n.length){
            a[k] = m[j++];
            continue;
        }
        if(j==m.length){
            a[k] = n[i++];
            continue;
        }
        if(n[i]>=m[j]){
            a[k] = m[j++];
        }else{
            a[k] = n[i++];
        }
    }
    System.out.println(Arrays.toString(a));
    if(a.length%2==0){
        return ((double)(a[(a.length/2)-1]+a[(a.length/2)])/2);
    }else{
        return ((double)a[a.length/2]);  
    }
    }
}