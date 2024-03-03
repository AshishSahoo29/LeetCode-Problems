/*58. Length of Last Word
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.

Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.

Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6. */

public class LengthOfLastWord {

    public int lengthOfLastWord(String s) {
        String s2 = s.trim();
        int n = s2.length();
        int count = 0;

        for (int i = n - 1; i >= 0; i--){
            if(s2.charAt(i) != ' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
        
}
