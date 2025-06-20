class Solution {
    public int subarraySum(int[] a, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
        int s=0;
        int c=0;
        m.put(s,1);

        for(int i=0;i<a.length;i++){
            s+=a[i];

            if(m.containsKey(s-k)){
                c+=m.get(s-k);
            }
            if(m.containsKey(s)){
                m.put(s,m.get(s)+1);
            }else{
                m.put(s,1);
            }
        }
        return c;
    }
}