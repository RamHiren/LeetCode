class Solution {
    public int shipWithinDays(int[] w, int d) {
        /* Linear serach 
        int min = w[0];
        int max = 0;
        for (int i : w) {
            max += i;
            if (i > min) {
                min = i;
            }
        }
        System.out.println(min);
        System.out.println(max);

        for (int i = min; i <= max; i++) {
            int day = 1;
            int currload = 0;
            for (int j = 0; j < w.length; j++) {
                if (currload + w[j] > i) {
                    day++;
                    currload = 0;
                }
                currload += w[j];
            }
            if (day <= d) {
                return i;
            }
        }

        return 1;*/


        int min = w[0];
    int max = 0;
    for (int i : w) {
        max += i;
        if(i > min){
            min = i;  
        }
    }

    while (min < max) {
        int mid = min + (max-min)/2;

        if(func(w, mid, d)){
            max=mid;
        }else{
            min=mid+1;
        }
    }
    return min;
}

    private static boolean func(int[] w, int mid, int d) {
        int day = 1;
        int currload = 0;
        for (int i = 0; i < w.length; i++) {
            if(currload+w[i] > mid){
                day++; 
                currload = 0;  
            }
            currload += w[i];
        }
        return day <= d;
    }
    
}