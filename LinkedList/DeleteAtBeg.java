public class DeleteAtBeg {

    public static class Node{
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static Node deleteAtBeg(Node head) {
        if(head == null) {
            System.out.print("Linked List is empty");
            return null;
        }else {
            head = head.next;
            return head;
        }
    }
    public static void display(Node head) {
        while(head != null) {
            System.out.print(head.data+" ");
            head= head.next;
        }
    }
    
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(16);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        a = deleteAtBeg(a);
        display(a);
    }
    
}
