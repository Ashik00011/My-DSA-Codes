public class DoublyLinkedList {
    private ListNode head;
    private ListNode tail;
    int length;

    public static class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data){
            this.data = data;
    }
    }
    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length =0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void display(){
        if(head == null){
            System.out.println("the list is empty");
        }
        else{
            ListNode current = head;
            while(current != null){
                System.out.println(current.data+"-->");
                current= current.next;
            }
        }
    }

    public void insertAtFront(int data)
    {
        ListNode newOne = new ListNode(data);
        if (isEmpty()){
            head = newOne;
            tail = newOne;

    }else{
            ListNode temp = head;
            temp.previous = newOne;
            newOne.next = head;
            head  = newOne;
        }
        length++;

    }

    public static void main(String [] args){
        DoublyLinkedList DL = new DoublyLinkedList();
        DL.insertAtFront(10);
        DL.insertAtFront(20);
        DL.insertAtFront(30);
        DL.insertAtFront(40);
        DL.insertAtFront(50);
        DL.insertAtFront(60);


        DL.display();



    }



}
