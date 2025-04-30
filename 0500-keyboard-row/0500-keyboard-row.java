class Solution {
    public String[] findWords(String[] s) {
        String frist = "qwertyuiop";
        String second = "asdfghjkl";
        String third ="zxcvbnm";
        ArrayList<String> ans = new ArrayList<>();

        for(int i=0;i<s.length;i++){
            String str = s[i].toLowerCase();
            int f1 =0;
            int f2 =0;
            int f3 = 0;
            for(int j=0;j<str.length();j++){
                if(frist.indexOf(str.charAt(j)) != -1) f1=1;
               if(second.indexOf(str.charAt(j)) != -1) f2=1;
               if(third.indexOf(str.charAt(j)) != -1) f3=1;
            }

            if(f1+f2+f3 <= 1) {
                ans.add(s[i]);
            }
        }

        String [] ans1 = new String[ans.size()];

        for(int i=0;i<ans.size();i++){
            ans1[i] = ans.get(i);
        }


        return ans1;

    }   
}