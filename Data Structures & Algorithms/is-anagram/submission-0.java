class Solution {
    public boolean isAnagram(String s, String t) {
        //if the length is not equal then return false
        if(s.length() != t.length()) {
            return false;
        }

        //create an array to count all the frequencies
        int[] charCount = new int[26];

        //iterate through the loop and increement the count for 's' and decreement the count for 't'
        for(int i=0; i<s.length(); i++) {
            charCount[s.charAt(i) - 'a']++;
            charCount[t.charAt(i) - 'a']--;
        }

        //for counting the 0's in the freq array -- if the count is 0 then true or false
        for(int count : charCount) {
            if(count != 0) {
                return false;
            }
        }
        return true;
    }
}
