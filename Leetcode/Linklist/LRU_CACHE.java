class Node
{
    int key;
    int val;
    Node next;
    Node prev;
    Node(int key,int value)
    {
       this.key=key;
       this.val=value;
    }
}

class LRUCache {
    int capacity;
    HashMap<Integer,Node>map;
    Node head,tail;
    public LRUCache(int capacity) {
       this.capacity=capacity;
        map=new HashMap<>();
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
        
    }
    public void  deleteNode(Node n)
    {
        Node previous=n.prev;
        Node Next=n.next;
        previous.next=Next;
        Next.prev=previous;
    }
    public void insertAtHead(Node n)
    {
        Node curr=head.next;
        head.next=n;
        n.next=curr;
        n.prev=head;
        curr.prev=n;

    }
    
    public int get(int key) {
         if(!map.containsKey(key))
         {
            return -1;
         }
         else{
            Node n=map.get(key);
            deleteNode(n);
            insertAtHead(n);

            return n.val;
         }

    }
    
    public void put(int key, int value) {
    

       if(map.containsKey(key))
       {
        Node n=map.get(key);
        n.val=value;
        deleteNode(n);
        insertAtHead(n);
       }
       else
       {
           if(map.size()==capacity)
           {
              Node n=tail.prev;
              deleteNode(n);
              map.remove(n.key);
            }
            Node node=new Node(key,value);
            insertAtHead(node);
            map.put(key,node);

       }
  
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */