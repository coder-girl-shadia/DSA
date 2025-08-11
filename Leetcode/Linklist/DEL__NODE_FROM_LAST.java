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
      
      ListNode temp=head;
      ListNode prev=head;
      int c=0,k=0,l=0;
      if(head==null || head.next==null)
      return null;
     
      else{
      while(temp!=null)
      {
        c++;
        temp=temp.next;
      }
      k=c-(n-1);
      temp=head;
      if(c==n)
      return head.next;
      else{
      while(temp!=null)
      {
        l++;
        if(k==l)
        {
            prev.next=temp.next;
            break;
        }
        prev=temp;
        temp=temp.next;
      }
      return head;
      }
 
    }
    }

}