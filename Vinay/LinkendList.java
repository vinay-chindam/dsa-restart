public class LinkendList {
    public static void main(String[] args) {
        
    }

    public static Node constructLL(int []arr) {
        // Write your code here
        Node head=new Node();
        if(arr.length==0){
            return head;
        }
        Node temp=head;

        for (int i:arr){
            Node temp2=new Node(i);
            temp.next=temp2;
            temp=temp2;


        }
        return head.next;

    }

    public static Node insertAtFirst(Node list, int newValue) {
        // Write your code here

        Node head=new Node(newValue);
        head.next=list;
        return head;
    }

    public void deleteNode(ListNode node) {
        if(node.next==null){
            node=null;
        }
        node.val=node.next.val;
        node.next=node.next.next;

        
    }


    public static int length(Node head){
        //Your code goes here

        int ans=0;
        while(head!=null){
            ans+=1;
            head=head.next;
        }
        return ans;
    }

    public static int searchInLinkedList(Node head, int k)
    {
        // Write Your Code Here.
    Node temp=head;
    while(temp!=null){
        if(temp.data==k){
            return 1;
        }
        temp=temp.next;
    }
    return 0;
    }

    public static Node constructDLL(int []arr) {
        // Write your code here
        Node head=new Node();
        Node temp=head;
        for(int i : arr){
            Node temp2=new Node (i);
            temp2.prev=temp;
            temp.next=temp2;
            temp=temp.next;
        }
        return head.next;
    }

    public static Node deleteLastNode(Node head) {
        // Write your code here
        if(head==null || head.next==null){
            return null;
        }
        Node  temp=head;
        Node prev2=head;
        while(temp.next!=null){
            prev2=temp;
            temp=temp.next;
        }
        
        prev2.next=null;
        return head;
    }

    public ListNode middleNode(ListNode head) {
        ListNode p1=head;
        ListNode p2=head;
        while(p1!=null && p2 !=null && p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
        }
        return p1;
        
    }

    public boolean hasCycle(ListNode head) {
        ListNode p1=head;
        ListNode p2=head;
        while(p1!=null && p2!=null && p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
            if(p1==p2){
                return true;
            }
        }
        return false;
        
    }

    public ListNode detectCycle(ListNode head) {
        ListNode l1=hasCycle(head);
        ListNode l2=head;
        if(l1==null){
            return l1;
        }
        while(l1!=l2){
            l1=l1.next;
            l2=l2.next;
        }
        return l1;
        
    }

    public ListNode hasCycle(ListNode head) {
        ListNode p1=head;
        ListNode p2=head;
        while(p1!=null && p2!=null && p2.next!=null){
            p1=p1.next;
            p2=p2.next.next;
            if(p1==p2){
                return p1;
            }
        }
        return null;
        
    }

        public ListNode reverseList(ListNode head) {

            ListNode prev=null;
            ListNode pres=head;
            ListNode next=head;
            if(head==null || head.next==null){
                return head;
            }
            while(pres!=null){
                next=pres.next;
                pres.next=prev;
                prev=pres;
                pres=next;
            }
            return prev;
            
        }

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode prev=null;
        ListNode pres=head;
        ListNode next=head;
        return recrev(prev,pres,next);

        
        
    }
    public static ListNode recrev(ListNode prev,ListNode pres,ListNode next){
        if(pres==null){
            return prev;
        }
        next=pres.next;
        pres.next=prev;
        prev=pres;
        pres=next;
        return recrev(prev,pres,next);
    }

    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        
        
        ListNode secHead=findmid(head);
        ListNode temp=secHead;
        
        
        ListNode newHead=reverseList(secHead);
        
        

        while(head!=null && newHead!=null){
            if(head.val!=newHead.val){
                return false;
            }
            head=head.next;
            newHead=newHead.next;
        }
        return true;

        
    }

     public ListNode reverseList(ListNode head) {

        ListNode prev=null;
        ListNode pres=head;
        ListNode next=head;
        if(head==null || head.next==null){
            return head;
        }
        while(pres!=null){
            next=pres.next;
            pres.next=prev;
            prev=pres;
            pres=next;
        }
        return prev;
        
    }
    public static ListNode findmid(ListNode head){
        ListNode fast=head;
        
        ListNode slow=head;
        ListNode prev=slow;
        while(slow!=null && fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=null;
        return slow;
    }

    public ListNode oddEvenList(ListNode head) {

        ListNode p1=head;
        
        if(p1==null || p1.next==null){
            return head;
        }
        ListNode p2=head.next;
        if(p2.next==null){
            return head;
        }
        ListNode h2=p2;
        while(p1!=null && p1.next!=null && p2!=null && p2.next!=null && p1.next.next!=null){
            p1.next=p1.next.next;
            p1=p1.next;

            p2.next=p2.next.next;
            p2=p2.next;
        }
        p1.next=h2;
        return head;
        
    }

    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode sm=findmid2(head);
        return head;
        
    }
    public static ListNode findmid2(ListNode head){
        ListNode fast=head;
        
        ListNode slow=head;
        ListNode prev=slow;
        while(slow!=null && fast!=null && fast.next!=null){
            fast=fast.next.next;
            prev=slow;
            slow=slow.next;
        }
        prev.next=prev.next.next;
        return slow;
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len=findlength(head);
        if(len==n){
            return head.next;
        }
        int ref=len-n;
        ListNode temp=head;
        for(int i=1;i<ref;i++){
            temp=temp.next;
        }
        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        return head;
    }
    public static int findlength(ListNode head){
        ListNode temp=head;
        int cnt=0;
        while(temp!=null){
            cnt+=1;
            temp=temp.next;
        }
        return cnt;
    }
    public static int lengthOfLoop(Node head) {
        int ans=1;
        Node temp=hasCycle(head);

        if(temp==null){
            return 0;
        }
        Node t1=head;
        while(temp!=t1){
            temp=temp.next;
            t1=t1.next;
        }
        t1=t1.next;
        while(t1!=temp){
            t1=t1.next;
            ans++;
        }
        return ans;
    
        
        
    
    }

    
    
}
