class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();


        for(int i=0;i<a.length;i++){
            if(s.isEmpty() || a[i] >0){
                s.push(a[i]);
            }else{
                while(!s.isEmpty()){
                    int t = s.peek();
                    if(t<0){
                        s.push(a[i]);
                        break;
                    }
                    int abVal = Math.abs(a[i]);

                    if(t<abVal){
                        s.pop();
                        if(s.isEmpty()){
                            s.push(a[i]);
                            break;
                        }
                    }else if(t == abVal){
                        s.pop();
                        break;
                    }else{
                        break;
                    }
                }
            }
        }

        int l = s.size();
        int [] ans = new int[l];

        for(int i=l-1; i>=0;i--){
            ans[i] = s.pop();
        }

       return ans;
    }
}