/*108. Convert Sorted Array to Binary Search Tree
Given an integer array nums where the elements are sorted in ascending order, convert it to a 
height-balanced binary search tree.
Example 1:
Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:
Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs */

public class ConvertSortedArrayToBbinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return sortedArrayToBST(nums, 0, nums.length - 1);        
    }

    private TreeNode sortedArrayToBST(int[] nums, int start, int end){
         if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;

        //mid point in sorted array is root 
        TreeNode root = new TreeNode(nums[mid]);

        //recursive call to fill left and right subtrees
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);

        return root;
    }    
}
