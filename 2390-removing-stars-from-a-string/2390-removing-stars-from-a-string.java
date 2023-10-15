class Solution {
    public String removeStars(String s) {
     
        StringBuilder ans = new StringBuilder() ; 
        
        for ( final char i : s.toCharArray()){
            if ( i == '*'){
                ans.deleteCharAt(ans.length()-1);
            }
            else
                ans.append(i);
        }
        return ans.toString();
    }
}