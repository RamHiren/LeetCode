class Solution:
    def countNegatives(self, a: List[List[int]]) -> int:
        c = 0
        for row in a:
            for element in row:
                if element < 0:
                    c += 1
        return c