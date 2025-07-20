class Solution {
    public List<String> letterCombinations(String d) {
        HashMap<Integer,String>m = new HashMap<>();

        m.put(2,"abc");
        m.put(3,"def");
        m.put(4,"ghi");
        m.put(5,"jkl");
        m.put(6,"mno");
        m.put(7,"pqrs");
        m.put(8,"tuv");
        m.put(9,"wxyz");

        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<d.length();i++){
            l.add(Integer.valueOf(d.charAt(i)-'0'));
        }
        
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0;i<l.size();i++){
            String s = m.get(l.get(i));
            System.out.println(s);
            if(ans.isEmpty()){
                for(int j=0;j<s.length();j++){
                    String t = s.charAt(j) + "";
                    ans.add(t);
                }
            }else{
                ArrayList<String> temp = new ArrayList<>();
                for (int k = 0; k < ans.size(); k++) {
                    for (int j = 0; j < s.length(); j++) {
                        temp.add(ans.get(k) + s.charAt(j));
                    }
                }
                ans = temp;
            }
           
        }

        return ans;
    }
}