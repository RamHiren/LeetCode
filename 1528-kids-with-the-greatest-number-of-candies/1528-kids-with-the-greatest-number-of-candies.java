class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> l = new ArrayList<Boolean>();
        int max = Arrays.stream(candies).max().getAsInt();

        for(int i =0; i<candies.length;i++){
            candies[i]= candies[i]+extraCandies;
            if(candies[i] >= max){
                l.add(true);
            }else{
                l.add(false);
            }
        }

        return l;
    }
}