class Solution {
    public int maxVowels(String s, int k) {
        
        int vowelCount=0;
        int maxCount=0;
        char[] c = {'a', 'e', 'i', 'o' ,'u'};
        
        Set<Character> vowels = new HashSet();
        for(char vowel : c)
        {
        vowels.add(vowel);
        }
        
        for( int i = 0 ; i<k ;i++)
        {
            if(vowels.contains(s.charAt(i)))
               {
                vowelCount++;
               }
               
               maxCount= vowelCount;
        }
               
               
         for( int i= k ; i< s.length(); i++)
         {
             
             if(vowels.contains(s.charAt(i-k)))
             {
                 vowelCount--;
             }
            
             if(vowels.contains(s.charAt(i)))
             {
                 vowelCount++;
             }
             
            maxCount= Math.max(vowelCount, maxCount);
         }

    return maxCount ;
    
    }
}

               
