import java.util.*;
public class insertInDLL {
    ListNode head;
    ListNode tail;
    int length;
    public class ListNode{
        int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data){
            this.data = data;
        }
    }
    public insertInDLL(){
        this.head = null;
        this.tail = null;
        this.length =0;
    }

        public boolean isEmpty(){
            return length == 0;

        }

        public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.data+"--->");
            temp = temp.next;
        }
        System.out.println("null");
        }

        public void insertAtBeging(int value){
            ListNode newNode = new ListNode(value);
            if(isEmpty()){
            tail = newNode;
        }
            else{
                head.previous = newNode;
            }
            newNode.next = head;
            head = newNode;
            length ++;
    }

    public void insertAtEnd(int value) {
        ListNode newNode = new ListNode(value);
        if (isEmpty()) {
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
        }
        length ++;
    }


        public static void main(String [] args){
        insertInDLL IDL = new insertInDLL();
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = Sc.nextInt();
        for(int i=1;i<=5;i++){
            System.out.println("enter the number nodes");
            int values = Sc.nextInt();
            IDL.insertAtBeging(values);
            IDL.insertAtEnd(values);
        }
        IDL.display();

    }
}
