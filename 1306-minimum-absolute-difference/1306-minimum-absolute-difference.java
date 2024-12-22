class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] a) {
         Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        List<List<Integer>> l = new ArrayList<>();
        int md= Integer.MAX_VALUE;
        for(int i=1;i<a.length;i++){
            if(a[i]-a[i-1]<md){
                md = a[i]-a[i-1];
            }
        }

        for(int i=1;i<a.length;i++){
            if(a[i]-a[i-1]==md){
                List<Integer> t = new ArrayList<>();
                t.add(a[i-1]);
                t.add(a[i]);
                System.out.println(t);
                l.add(t);
            }
        }
        return l;
    }
}