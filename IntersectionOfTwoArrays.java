/*
 * 349. Intersection of Two Arrays
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must be unique and you may return the result in any order.

Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]

Approach:

We can solve this problem by using a set to store unique elements from one of the arrays and then iterating through the other array to check for common elements.

Steps to solve the problem:

Initialize an empty set set to store unique elements.
Iterate through nums1 and add each element to the set.
Initialize an empty list intersection to store the intersection elements.
Iterate through nums2:
If the current element is present in the set, add it to the intersection list and remove it from the set to avoid duplicates.
Convert the intersection list to an array and return it.

*/
import java.util.*;
public class IntersectionOfTwoArrays{
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> st = new HashSet<>();
        List<Integer> intersection  = new ArrayList<>();

        for(int num: nums1){
            st.add(num);

        }

        for(int nums: nums2){
            if(st.contains(nums)){
                intersection.add(nums);
                st.remove(nums);//to avoid duplicity
            }
        }
        int[] res = new int[intersection.size()];
        for(int i = 0; i < intersection.size(); i++){
            res[i] = intersection.get(i);
        }

        return res;
    }

}