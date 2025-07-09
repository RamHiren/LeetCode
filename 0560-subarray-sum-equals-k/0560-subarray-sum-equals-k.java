class Solution {
    public int subarraySum(int[] a, int k) {
        HashMap<Integer,Integer> m  =new HashMap<>();
        int sum=0;int ans=0;

        m.put(0,1);
        for(int i=0;i<a.length;i++){
            sum+=a[i];

            if(m.containsKey(sum-k)){
                ans += m.get(sum-k);
            }  

            if(m.containsKey(sum)){
                m.put(sum,m.get(sum)+1);
            }else{
                m.put(sum,1);
            }

        }

        return ans;
    }
}