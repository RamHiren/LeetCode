class Solution(object):
    def getRow(self, n):
        l = [1]
        for i in range(1,n+1):
            l.append(l[i-1]*i)
        
        x=l[len(l)-1]
        l1=[]
        for i in range(0,n+1):
            l1.append(x/(l[i]*l[n-i]))

        return l1
        