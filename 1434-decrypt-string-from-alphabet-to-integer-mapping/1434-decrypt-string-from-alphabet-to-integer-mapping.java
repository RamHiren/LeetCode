class Solution {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
      for(int i=s.length()-1; i>=0; i--){
          if(s.charAt(i)=='#'){
              int num = Integer.parseInt(s.substring(i-2, i));
              sb.append((char)('a'+num-1));
              i-=2;
          }else{
              sb.append((char)('a'+s.charAt(i)-'1'));
          }
      }
      return sb.reverse().toString();
    }
}