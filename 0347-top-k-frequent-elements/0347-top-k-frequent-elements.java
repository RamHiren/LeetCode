class Solution {
    public int[] topKFrequent(int[] a, int k) {
        HashMap<Integer,Integer> m = new HashMap<>();
                   
        for(int i:a){
            if(m.containsKey(i)){
                m.put(i,m.get(i)+1);
            }else{
                m.put(i,1);
            }
        }

        // System.out.println(m.values()); //--> count 
        // System.out.println(m.keySet()); // --> ele
        ArrayList<Integer>count=  new ArrayList<>(m.values());
        Collections.sort(count);
        System.out.println(count);


        int[] result = new int[k];
        int idx = 0;
        int freqIndex = count.size() - 1;

        while (idx < k && freqIndex >= 0) {
            int freq = count.get(freqIndex);

            for (Map.Entry<Integer, Integer> entry : m.entrySet()) {
                if (entry.getValue() == freq) {
                    result[idx++] = entry.getKey();
                    m.put(entry.getKey(), -1); 
                    if (idx == k) break;
                }
            }
            freqIndex--;
        }

        return result;
    }
}