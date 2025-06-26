class Solution {
    public int minOperations(int[] a, int x) {
        int sum =0;
        for(int i:a)sum += i;

        int t = sum -x;

        HashMap<Integer,Integer> m = new HashMap<>();
        m.put(0,-1);

        int max = 0;
        int s =0;

        for(int i=0;i<a.length;i++){
            s += a[i];
            if(m.containsKey(s-t)){
                max = Math.max(max, i-m.get(s-t)); 
            }
            if(!m.containsKey(s)){
                m.put(s,i);
            }
        }

        if(max==0&& t !=0)return -1;
        return a.length-max;
    }
}