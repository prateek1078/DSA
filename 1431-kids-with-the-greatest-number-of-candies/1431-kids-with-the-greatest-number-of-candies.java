class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
       int max = 0;
        for( int i : candies){
            max = Math.max(i , max);
        }
        
        List <Boolean> result =  new ArrayList<>();
        for ( int i : candies)
        {
            result.add(i+extraCandies>= max);
        }
        return result;
}
}