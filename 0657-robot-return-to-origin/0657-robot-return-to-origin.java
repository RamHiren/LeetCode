class Solution {
    public boolean judgeCircle(String s) {
        int x=0;
        int y=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U') x++;
            if(s.charAt(i)=='D') x--;
            if(s.charAt(i)=='L') y--;
            if(s.charAt(i)=='R') y++;
        }

        if(x==0 && y==0) return true;

        return false;
    }
}