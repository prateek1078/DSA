class Solution {
    public boolean isSubsequence(String s, String t) {
        
        //converted to a character array
        char[] sub = s.toCharArray();
        char[] string = t.toCharArray();
        
        int i=0;
        int j=0;
        
        //now using pointer approach, increasing i if its a match, else j
        while(i<sub.length && j<string.length){
            if(sub[i]==string[j]){
                i++;
            }
          j++;
        }
        
        //if i e
        return i==sub.length;
        
    }
}