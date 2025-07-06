class Solution {
    public int longestOnes(int[] a, int k) {
        int i=0;
        int j=0;
        int max = 0;

        while(i<a.length && k>0){
            if(a[i]==0){
                k--;
            }
            i++;
        }

        max = Math.max(max,i-j);
        System.out.println(i+" "+j+ " " +k+" "+max);

        for(;i<a.length;i++){
            if(a[i]==0){
                while(j<a.length && k<1){
                    if(a[j]==0){
                        k++;
                    }
                    j++;
                }
                k--;
            }
             max = Math.max(max,i-j+1);
            System.out.println(i+" "+j+ " "+k+" " +max);

        }


        return max;
    }
}