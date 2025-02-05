class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int x=-1,y=-1;
        int c=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                c++;
                if(x==-1){
                    x=i;
                }else{
                    y=i;
                }
            }
        }

        if(c==0){
            return true;
        }
        
        if(c==2 && s1.charAt(x)==s2.charAt(y) && s1.charAt(y)==s2.charAt(x)){
            return true;
        }

        return false;
        
    }
}