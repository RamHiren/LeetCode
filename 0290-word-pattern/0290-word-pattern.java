class Solution {
    public boolean wordPattern(String p, String s) {
        String [] a = s.split(" ");
         if (p.length() != a.length) return false;
        HashMap<Character,String> m = new HashMap<>();
        HashSet<String> set = new HashSet<>();


        for(int i=0;i<a.length;i++){
            if(m.containsKey(p.charAt(i))){
                if(!m.get(p.charAt(i)).equals(a[i])){
                    return false;
                }
            } else{
                if(set.contains(a[i])){
                    return false;
                }
                m.put(p.charAt(i),a[i]);
                set.add(a[i]);
            }
        }

        return true;
    }
}