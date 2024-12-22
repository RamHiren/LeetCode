class Solution {
    public int[] relativeSortArray(int[] a, int[] b) {
int[] c= new int[a.length];
        List <Integer> l = new ArrayList<>();
        int k=0;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){
                    l.add(a[j]);
                }
            }
        }
        Arrays.sort(a);
        for(int i : l){
            c[k]=i;
            k++;
        }
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            if(!l.contains(a[i])){
                c[k]=a[i];
                k++;
            }
        }
        return c;
    }
}