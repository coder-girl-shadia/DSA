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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp=head;
        int len=0;
        if(head==null || head.next==null)
        return head;
        else if(k==0)
        return head;
        else{
        while(temp.next!=null)
        {
            len++;
          temp=temp.next;
        }
        len=len+1;//last 1 increment coz above loop do not include tail count
        
        
         if(k%len==0)
         return head;
         if(k>len)
         k=k%len;
         temp.next=head;
         temp=head;
         int c=1;
         while(c<(len-k)) 
         {
             c++;
            temp=temp.next;
           
         } 
         ListNode newhead=temp.next;
         //System.out.println(newhead.val);
         temp.next=null;
         return newhead; 
        }




        
    }
}