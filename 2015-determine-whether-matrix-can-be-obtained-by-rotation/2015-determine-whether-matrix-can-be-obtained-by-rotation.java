class Solution {
    public boolean findRotation(int[][] a, int[][] b) {
      if ((Arrays.deepToString(b)).equals(Arrays.deepToString(a))) {
            return true;
        }
      int n =3;
      while(n-->0){
        int[][] c = new int[a.length][a[0].length];  
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                c[j][a.length-i-1] = a[i][j];
            }
        }
        String s1 = Arrays.deepToString(b);
        String s2 = Arrays.deepToString(c);
        if(s1.equals(s2)){
            return true;
        }else{
            a=c;
        }
      }
        return false;
    }
}