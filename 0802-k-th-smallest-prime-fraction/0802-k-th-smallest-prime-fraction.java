class Solution {
    public int[] kthSmallestPrimeFraction(int[] a, int k) {
        if(a.length == 2) return a;

        ArrayList<Double> l = new ArrayList<>();

        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                l.add((double)a[i]/a[j]);
            }
        }
        Collections.sort(l);
        double f = l.get(k-1);
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(f==(double)a[i]/a[j]){
                    return new int [] {a[i],a[j]};
                }
                if(f>(double)a[i]/a[j]){
                    break;
                }
            }
        }
        
        return new int[] {1,1};
    }
}