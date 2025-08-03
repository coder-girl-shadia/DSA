
class Solution {
    public ListNode middleNode(ListNode head) {


        ListNode temp=head;
        int c=0,k=0;
        while(temp!=null)
        {
            c++;
           temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            k++;
            if(k==((c/2)+1))
            break;
                           
            temp=temp.next;
        }
        return temp;
        
    }
