class Solution {
    public boolean isHappy(int n) {
       Set<Integer> s = new HashSet<>();

        while(true){
            int sum = 0;
            while(n>0){
                int t = n % 10;
                sum = sum + (t*t);
                n = n/ 10; 
            }
            if(sum == 1){
                return true;
            }else{
                
                if(s.contains(sum)){
                    return false;
                }else{
                    s.add(sum);
                    n=sum;
                }
            }
        }

        // return false;
    }
}