class Solution {
    public int largestPerimeter(int[] a) {
        Arrays.sort(a);

        int n = a.length-1;

        for(int i =n;i>=2;i--){
            if(a[i]+a[i-1]>a[i-2]&&a[i-1]+a[i-2]>a[i]&&a[i]+a[i-2]>a[i-1]){
                return a[i]+a[i-1]+a[i-2];
            }
        }

        return 0;
    }
}