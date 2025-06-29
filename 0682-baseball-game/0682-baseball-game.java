class Solution {
    public int calPoints(String[] a) {
        Stack<Integer> s = new Stack<>();
   
        for(int i=0;i<a.length;i++){
            if(a[i].equals("+")){
                int x1=s.pop();
                int x2=s.pop();
                s.push(x2);
                s.push(x1);
                s.push(x1+x2);
            }else if(a[i].equals("D")){
                int x=s.peek();
                s.push(2*x);
            }else if(a[i].equals("C")){
                s.pop();
            }else{
                s.push(Integer.valueOf(a[i]));
            }
        }

        if(!s.isEmpty()){
            int sum =0;
             while(!s.isEmpty()){
                   int x = s.pop();
                    sum+=x;
                }
                return sum;
        }
        return 0;
    }
}