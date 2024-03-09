/*2540. Minimum Common Value
Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.
Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

Example 2:
Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.

Constraints:
1 <= nums1.length, nums2.length <= 105
1 <= nums1[i], nums2[j] <= 109
Both nums1 and nums2 are sorted in non-decreasing order. 

Approach:
We can solve this problem by using two pointers to iterate through both arrays simultaneously. Since both arrays are sorted, we can compare elements from both arrays to find the minimum common value.
Steps to solve the problem:
Initialize two pointers, i and j, to iterate through nums1 and nums2 respectively, starting from the first element.
While both pointers are within the bounds of their respective arrays:
If nums1[i] is equal to nums2[j], return nums1[i] as it is the minimum common value.
If nums1[i] is less than nums2[j], increment i.
If nums1[i] is greater than nums2[j], increment j.
If no common value is found, return -1.

time complexity: O(m+n)
space complexity: O(1)
*/
import java.util.*;
public class MinimumCommonValue {
    public int getCommon(int[] nums1, int[] nums2) {
        //two pointers for num1 and num2
        int p1 = 0;
        int p2 = 0;

        while(p1 < nums1.length && p2 < nums2.length){
            if(nums1[p1] == nums2[p2]) return nums1[p1]; 
            else if (nums1[p1] < nums2[p2]) p1++;
            else p2++;
        }
        return -1;
    }
}

/*Approach2
 * Create a hash set and fill it with the elements of first array
 * then iterate over 2nd array and check if the set contains tha element, if found return that number
 * otherwise return -1
 * time complexity: O(n)
 * space complexity: O(n) as here we are using a hash set 
 * 
 */
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();

        for(int num: nums1){
            st.add(num);
        }

        for(int nums: nums2){
            if(st.contains(nums)) return nums;
        }

        return -1;
    }
}
