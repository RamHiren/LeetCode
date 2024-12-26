class Solution {
    public String sortSentence(String str) {
        Map <Integer,String> m = new HashMap<>();
        for(String s : str.split(" ")){
            int i = s.charAt(s.length()-1)-'0';
            String a= s.substring(0, s.length()-1);
            m.put(i,a);
        }
        StringBuilder ans = new StringBuilder();
        for(Map.Entry<Integer,String> i: m.entrySet()){
            ans.append(i.getValue());
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}