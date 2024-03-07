/*876. Middle of the Linked List
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Example 2:
Input: head = [1,2,3,4,5,6]
Output: [4,5,6]
Explanation: Since the list has two middle nodes with values 3 and 4, we return the second one. 

Approach: 
We can solve this problem using the slow and fast pointer approach. 
We iterate through the linked list with two pointers: slow and fast. 
The slow pointer moves one step at a time, while the fast pointer moves two steps at a time. 
When the fast pointer reaches the end of the list, the slow pointer will be at the middle node.
*/
public class MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;        
    }
}

