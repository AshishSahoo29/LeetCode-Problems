/*Problem Statement:
2864. Maximum Odd Binary Number
You are given a binary string s that contains at least one '1'.
You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.
Return a string representing the maximum odd binary number that can be created from the given combination.
Note that the resulting string can have leading zeros.

Example 1:
Input: s = "010"
Output: "001"
Explanation: Because there is just one '1', it must be in the last position. So the answer is "001".

Example 2:
Input: s = "0101"
Output: "1001"
Explanation: One of the '1's must be in the last position. The maximum number that can be made with the remaining digits is "100". So the answer is "1001".

Approach:
Lets work with examples:
            s = "010110"
Lets just count no. of 1's and 0's.
            cnt1 = 3 and cnt0 = 3
Since we need greatest odd number we obviously need one 1 
at the last to make it odd and best chances to make it greatest 
is by putting rest every 1's at the front.

            ans = "11" + "000" + "1"

            ans = "110001"

Will work for all cases.
Complexity
Time complexity:
O(n)
Space complexity:
O(n) */
public class MaximumOddBinaryNumber {
    public String maximumOddBinaryNumber(String s) {
        int countOne = 0, countZero = 0;
        char[] arr = s.toCharArray();
        for (char ch: arr){
            if(ch == '1'){
                countOne++;
            }else{
                countZero++;
            }
        }
        StringBuilder res = new StringBuilder();
        res.append("1".repeat(countOne - 1));
        res.append("0".repeat(countZero));
        res.append("1");

        return res.toString();
    }
}
