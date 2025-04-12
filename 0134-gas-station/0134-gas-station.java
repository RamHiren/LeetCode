class Solution {
    public int canCompleteCircuit(int[] g, int[] c) {
        if(g.length==1 && g[0]>=c[0]) return 0;
        if(g.length==1 && g[0]<c[0]) return -1;


        for(int i= 0;i<g.length;i++){
            int f =g[i],x=0;

            if(g[i]>c[i]){
                for(int j=i;j<g.length+i;j++){
                f = f  - c[j%g.length] +g[(j+1)%g.length];
                if(f<c[(j+1)%g.length]){
                    x=1;
                    break;
                }
            }
            if(x==0) return i;
            }

            
        }
    return -1;
        
    }
}