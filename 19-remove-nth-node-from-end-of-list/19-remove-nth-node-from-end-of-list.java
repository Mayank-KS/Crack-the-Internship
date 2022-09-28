/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode start = new ListNode(0);
    ListNode x = start, y = start;
    x.next = head;

    for(int i=1; i<=n+1; i++)   {
        y = y.next;
    }

    while(y != null) {
        x = x.next;
        y = y.next;
    }

    x.next = x.next.next;
    return start.next;
    }
}