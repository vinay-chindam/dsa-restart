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
    
}
