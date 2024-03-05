/*Problem Statement:
Given a string s consisting only of characters 'a', 'b', and 'c'. You are asked to apply the following algorithm on the string any number of times:

Pick a non-empty prefix from the string s where all the characters in the prefix are equal.
Pick a non-empty suffix from the string s where all the characters in this suffix are equal.
The prefix and the suffix should not intersect at any index.
The characters from the prefix and suffix must be the same.
Delete both the prefix and the suffix.
Return the minimum length of s after performing the above operation any number of times (possibly zero times).
Example 2:
Input: s = "cabaabac"
Output: 0
Explanation: An optimal sequence of operations is:
- Take prefix = "c" and suffix = "c" and remove them, s = "abaaba".
- Take prefix = "a" and suffix = "a" and remove them, s = "baab".
- Take prefix = "b" and suffix = "b" and remove them, s = "aa".
- Take prefix = "a" and suffix = "a" and remove them, s = "".

Example 3:
Input: s = "aabccabba"
Output: 3
Explanation: An optimal sequence of operations is:
- Take prefix = "aa" and suffix = "a" and remove them, s = "bccabb".
- Take prefix = "b" and suffix = "bb" and remove them, s = "cca".


Approach
Initialize two pointers, l and r, pointing to the start and end of the string respectively.
While l is less than r and the characters at l and r are equal, do the following:
a. Save the character at l (or r, since they are equal).
b. Move l to the right until either it reaches r or the character at l changes.
c. Move r to the left until either it reaches l or the character at r changes.
Return the minimum length of the remaining string after removing the common prefixes and suffixes.
Here's the step-by-step explanation of the code:

It starts by initializing two pointers l and r at the start and end of the string respectively.
Then it enters a while loop which continues as long as l is less than r and the characters at l and r are the same.
Inside the loop, it saves the character at l (or r since they are equal).
Then it moves l to the right until either it reaches r or the character at l changes. This ensures it traverses the prefix.
Similarly, it moves r to the left until either it reaches l or the character at r changes. This ensures it traverses the suffix.
Finally, it returns the minimum length of the remaining string after removing the common prefixes and suffixes.

Complexity
Time complexity:O(n)
Space complexity:O(1) */
public class MinimumLengthOfStringAfterDeletingSimilarEnd {
    public int minimumLength(String s) {
        //two pointers
        int left = 0;
        int right = s.length() - 1;
        if(s.length() == 1)return 1;

        while(left < right && s.charAt(left) == s.charAt(right)){
            char curr = s.charAt(left);
            while(left <= right && s.charAt(left) == curr){
                //skip
                left++;
            }
            while(left <= right && s.charAt(right) == curr){
                right--;
            }
            
            
        }
        return (left > right) ? 0 : right - left + 1; 
   
    }
}
