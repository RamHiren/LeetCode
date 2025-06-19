class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> s = new Stack<>();

        for(int i=0;i<a.length;i++){
            if(s.isEmpty() || s.peek()<0){
                s.push(a[i]);
            }else{
                if(s.peek()>0 && a[i]>0){
                    s.push(a[i]);
                }else{
                    while(!s.isEmpty()){
                        if(s.peek()==Math.abs(a[i])){
                            s.pop();
                            break;
                        }
                        if(s.peek()>Math.abs(a[i])||s.peek()<0){
                            break;
                        }else{
                            s.pop();
                            if(s.isEmpty() || s.peek()<0)s.push(a[i]);
                        }
                    }
                }
            }
        }

        ArrayList<Integer> l =new ArrayList<>();
        while(!s.isEmpty()){
            l.add(s.pop());
        }
        Collections.reverse(l);

        int b[] = new int[l.size()];

        for(int i=0;i<b.length;i++){
            b[i] = l.get(i);
        }

        return b;
    }
}