class Solution:
    def countNegatives(self, l: List[List[int]]) -> int:
        c =0
        for i in range(len(l)):
            for j in range(len(l[i])):
                if l[i][j]<0:
                    c = c+1
        return c