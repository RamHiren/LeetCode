class Solution {
    public int[] findRightInterval(int[][] a) {
        
        int ans[] = new int[a.length];
        for (int i = 0; i < ans.length; i++) {
            ans[i]= (-1);
        }
        
        for (int i = 0; i < a.length; i++) {
            int x = Integer.MAX_VALUE;
            int idx =-1;
            System.out.println(x);            
            for (int j = 0; j < a.length; j++) {
                if(a[i][1]<= a[j][0] && a[j][0]<=x ){                   
                    x= a[j][0];
                    idx =j;
                    System.out.println(x+" "+j);                   
                }
            }
            ans[i] = idx;
        }
        return ans;
    }
}