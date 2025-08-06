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
    public boolean isPalindrome(ListNode head) {
        ListNode s=head;
        ListNode f=head;
        while(f.next!=null && f.next.next!=null)
        {
            s=s.next;
            f=f.next.next;

        }
        ListNode rh= reverseList(s.next);
         ListNode first=head;
         ListNode second=rh;
         while(second!=null)
         {
            if(first.val!=second.val)
            return false;
            first=first.next;
            second=second.next;


         }
         return true;




        
    }
    public ListNode reverseList(ListNode head) {
        ListNode curr=head;
        ListNode last=null;
        while(curr!=null)
        {
            ListNode front=curr.next;
            curr.next=last;
            last=curr;
            curr=front;

        }
        return last;



        
    }
}