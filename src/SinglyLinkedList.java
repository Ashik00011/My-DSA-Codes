
public class SinglyLinkedList {
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;


        public ListNode (int data) {
            this.data = data;
            this.next = next;

        }

    }
    public void display() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        ListNode current = head; // Start from the head node
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next; // Move to the next node
        }
        System.out.println("null"); // End of the list
    }


    public static void main(String [] args){
        SinglyLinkedList SL = new SinglyLinkedList();
        SL.head = new ListNode(10);
        ListNode second = new ListNode(20);
        ListNode third = new ListNode(30);
        ListNode fouth = new ListNode(40);


        SL.head.next = second;
        second.next = third;
        third.next = fouth;
        SL.display();

    }

}
