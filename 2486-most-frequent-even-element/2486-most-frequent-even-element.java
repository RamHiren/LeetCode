class Solution {
    public int mostFrequentEven(int[] a) {
        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i:a){
            if(i%2==0 && m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }else if(i%2==0 && !m.containsKey(i)){
                m.put(i,1);
            }
        }

        int ans =-1;
        int c=0;

        for(Integer i : m.keySet()){
            int count = m.get(i);
            if(c==count){
                ans = Math.min(ans,i);
                
            }
            if(c<count){
                ans = i;
                c=count;
            }
        }
        
        return ans;
    }
}