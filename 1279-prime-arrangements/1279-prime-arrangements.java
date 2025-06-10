class Solution {
    public int numPrimeArrangements(int n) {
        long c=0;
        int MOD = 1000000007;

        for(int i=2;i<=n;i++){
            if(isPrime(i)) c++; 
        }


        long ans = 1;

        for(long i=1;i<=c;i++){
            ans = (ans*i) % MOD;
        }

        long np = n-c;
        

        for(long i=1;i<=np;i++){
            ans = (ans*i) % MOD;
        }


        return (int)ans%MOD;
    }

    private boolean isPrime(int n){
        for(int i=2;i<=n/2;i++){
            if(n%i==0) return false;
        }
        return true;
    }
}