class Solution {
    public int findCenter(int[][] a) {
        HashMap<Integer,Integer> m = new HashMap<>();

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                if(m.containsKey(a[i][j])){
                    m.put(a[i][j],m.get(a[i][j])+1);
                }else{
                    m.put(a[i][j],1);
                }
            }
        }

        System.out.println(m);
        int max =0;
        int ans =0;
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(e.getValue()>max){
                ans = e.getKey();
                max=e.getValue();
            }
        }

        return ans;
    }
}