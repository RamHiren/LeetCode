class Solution {
    public int threeSumClosest(int[] a, int t) {
       int ans=Integer.MAX_VALUE;
        Arrays.sort(a);

        for (int i = 0; i < a.length-2; i++) {
            int p = i + 1;
            int q = a.length - 1;

            while (p < q) {
                int sum =a[i] + a[p] + a[q];
                if (sum == t) {
                    System.out.println(a[i] + " " + a[p] + " " + a[q]);
                    return sum;
                   
                } else if (sum > t) {
                    if(Math.abs(sum-t)<Math.abs(t-ans)){
                        ans=sum;
                        System.out.println(a[i] + " " + a[p] + " " + a[q]);
                    }
                    q--;
                } else if(sum < t) {
                    if(Math.abs(sum-t)<=Math.abs(t-ans)){
                        ans=sum;
                        System.out.println(a[i] + " " + a[p] + " " + a[q]);
                    }
                    p++;
                }

            }

        }
        return ans;
    }
}