class Solution {
    public List<List<String>> groupAnagrams(String[] str) {
         Map<String,List<String>> m = new HashMap<>();
    
        for(int i=0;i<str.length; i++){
            char[] c = str[i].toCharArray();
            Arrays.sort(c);
            String sorted =new String(c);

            if(!m.containsKey(sorted)){
                m.put(sorted,new ArrayList<>());
            }
            m.get(sorted).add(str[i]);
        }
        System.out.println(Arrays.deepToString(str));
        return new ArrayList<>(m.values());
    }
}