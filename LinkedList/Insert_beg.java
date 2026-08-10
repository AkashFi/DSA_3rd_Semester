public class Insert_beg {

    public static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }
    public static class linkedlist {
        Node head = null;
        Node tail = null;
        void insertAtBeg(int val) {
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail = temp;
            }
            else{
                temp.next = head;
                head = temp;
            }
        }
        void display() {
            Node temp = head;
            while(temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtBeg(3);
        ll.insertAtBeg(5);
        ll.insertAtBeg(9);
        ll.insertAtBeg(1);
        ll.display();
        

        
    }
    
}
