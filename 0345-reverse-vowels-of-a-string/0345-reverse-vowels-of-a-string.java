class Solution {
        public String reverseVowels(String s) {
            char[] a = s.toCharArray();

            int l = 0;
            int r = a.length - 1;

            while (l < r) {
                if (isVowel(a[l]) && isVowel(a[r])) {
                    // swap(a, l++, r--); we can also use this inbuilt function or
                    char temp;
                    temp= a[l];
                    a[l] = a[r];
                    a[r]= temp;
                    l++;
                    r--;
                } else if (isVowel(a[l])) {
                    r--;
                } else {
                    l++;
                }
            }

            return new String(a);
        }
     private boolean isVowel(char b) { // The letters A, E, I, O, and U are called vowels
            char c = Character.toLowerCase(b);
            return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
        }
}