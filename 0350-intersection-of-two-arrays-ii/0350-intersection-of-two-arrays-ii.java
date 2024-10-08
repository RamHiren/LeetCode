class Solution {
    public int[] intersect(int[] a, int[] b) {
       List<Integer> l = new ArrayList<>();
       
        int length1 = a.length;
        int length2 = b.length;
        int i =0;
        int j =0;
        Arrays.sort(a);
        Arrays.sort(b);
       
        while (i<length1 && j<length2) {
            if(a[i]>b[j]){
                
                j++;
            }else if(a[i]<b[j]){
                i++;
            }else{
                l.add(a[i]);
                i++;
                j++;
            }
        }

        int[] c = new int[l.size()];
        for (int k = 0; k < c.length; k++) {
            c[k] = l.get(k);
        }
        return c;
    }
}