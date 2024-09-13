class Solution {
    public List<Integer> spiralOrder(int[][] a) {
       List<Integer> l = new ArrayList<>();
        int rs = 0;
        int cs = 0;
        int re = a.length-1;
        int ce = a[0].length-1;

        while (rs<=re && cs<=ce) {
            for(int i = cs; i<=ce;i++){
                l.add(a[rs][i]);
            }
            rs++;
            for(int i = rs; i<=re;i++){
                l.add(a[i][ce]);
            }
            ce--;
            if(rs<=re){
                for(int i = ce; i>=cs;i--){
                    l.add(a[re][i]);
                }
            }
            
            re--;
            if(cs<=ce){
                for(int i = re; i>=rs;i--){
                    l.add(a[i][cs]);
                }
            }   
            cs++;
        }
       return l;
    }
}