/*Problem: Remove Nth Node From End of List
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Approach:
We can solve this problem using the two-pointer technique. 
We maintain two pointers: one pointer, fast, advances n steps ahead from the head, and the other pointer, slow, starts from the beginning. 
Then, we move both pointers simultaneously until the fast pointer reaches the end of the list.
At this point, the slow pointer will be at the node just before the nth node from the end. We remove the nth node by adjusting the next pointer of the node before it.


The time complexity of the algorithm is O(n) since we need to iterate through the entire list once.
The space complexity of the algorithm is O(1) since we use only a constant amount of extra space for the slow and fast pointers. */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;

        //move fast pointer n times faster than slow pointer
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        //move both pointers simultaneously here
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        //at this point slow pointer has reached desired index
        slow.next = slow.next.next;

        return dummy.next;

    }
    
}
