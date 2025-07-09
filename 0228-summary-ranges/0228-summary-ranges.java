class Solution {
    public List<String> summaryRanges(int[] a) {
        List<String> l = new ArrayList<>();
        if (a.length == 0) return l;

        int s = a[0];  
        int e = a[0]; 

        for (int i = 1; i < a.length; i++) {
            if (a[i] == e + 1) {
                e = a[i];
            } else {
                if (s == e) {
                    l.add(String.valueOf(s));
                } else {
                    l.add(s + "->" + e);
                }
                s = e = a[i];
            }
        }

        if (s == e) {
            l.add(String.valueOf(s));
        } else {
            l.add(s + "->" + e);
        }

        return l;
    }
}
