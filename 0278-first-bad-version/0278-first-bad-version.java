/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 0;
        int e = n;
        int m;
        int min=0;

        while(s<=e){
            m = s + ((e-s)/2);
            if(isBadVersion(m+1)){
                min = m+1;
                e = m-1;
            }
            else{
                s = m+1;
            }
        }
        return min;
    }
}