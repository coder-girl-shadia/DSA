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
    public boolean hasCycle(ListNode head) {
        int c=0;
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null)
        {
            s=s.next;
            f=f.next.next;
            if(s==f)
            {
            c=1;
            break;
            }

        }
       if(c==1)
       return true;
       else
       return false;



        
    }
}
