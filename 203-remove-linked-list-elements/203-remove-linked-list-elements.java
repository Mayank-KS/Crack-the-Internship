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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
            return head;
        ListNode n=head;
        while(n!=null)
        {
        ListNode m=n.next;
        if(n.next != null && m.val==val)
            n.next=m.next;
        else
            n=n.next;
        }
        if(head.val==val)
            head=head.next;
        
        return head;
    }
}