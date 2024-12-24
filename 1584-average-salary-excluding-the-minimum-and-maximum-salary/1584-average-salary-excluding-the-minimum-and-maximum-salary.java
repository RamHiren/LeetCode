class Solution {
    public double average(int[] a) {
        Arrays.sort(a);
        double sum=0;
        for(int i=1;i<a.length-1;i++){
            System.out.println(a[i]);
            sum+=(double)a[i];
        }
        return (sum/(a.length-2)); 
    }
}