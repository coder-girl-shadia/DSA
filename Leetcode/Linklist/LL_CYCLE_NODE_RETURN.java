/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {

         int c=0;
        ListNode s=head;
        ListNode f=head;
        ListNode node=null;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
            if(s==f)
            {
              node=s;
              c=1;
            break;
            }

        }
        if(c==1)
        {
       f=head;
       while(f!=s)
           {
            f=f.next;
            s=s.next;
           }
           return f;
        }
        else
        return null;
        
    }
}