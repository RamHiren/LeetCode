class Solution {
    public boolean canConstruct(String r, String a) {
        HashMap<Character,Integer> m = new HashMap<>();

        for(int i=0;i<a.length();i++){
            char ch= a.charAt(i);
            if(m.containsKey(ch)){
                m.put(ch,m.get(ch)+1);
            }else{
                m.put(ch,1);
            }
        }

        for(int i=0;i<r.length();i++){
            char ch = r.charAt(i);

            if(m.containsKey(ch)){
                
                if(m.get(ch)==0){
                    System.out.println("Enter IF");
                    return false;
                }
                m.put(ch,m.get(ch)-1);
            }else{
                System.out.println("Enter else");
                return false;
            }
        }

        return true;
    }
}