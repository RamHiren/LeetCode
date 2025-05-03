class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> m = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(m.containsKey(s.charAt(i)) && m.get(s.charAt(i)) != t.charAt(i)){
                return false;
            }
            m.put(s.charAt(i),t.charAt(i));
        }

        HashMap<Character,Character> m1 = new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(m1.containsKey(t.charAt(i)) && m1.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }
            m1.put(t.charAt(i),s.charAt(i));
        }

        return true;
    }
}