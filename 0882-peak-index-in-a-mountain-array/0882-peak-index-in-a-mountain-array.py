class Solution:
    def peakIndexInMountainArray(self, l: List[int]) -> int:
        s,e =0,len(l)-1
        
        while s < e:
            mid = (s+e)//2
            if l[mid] > l[mid+1]:
                e = mid
            else:
                s=mid+1

        return s