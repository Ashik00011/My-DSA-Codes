import java.util.*;
public class InsertAtEnd {
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        if (head == null){
            System.out.println("the list is empty");
        }else{
            ListNode current = head;
            while(current != null){
                System.out.println(current.data+"-->");
                current = current.next;


            }
        }
    }

    public void insert(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
        }else{
            ListNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        display();
    }

    public static void main(String [] args){
        InsertAtEnd IE =  new InsertAtEnd();
        Scanner Sc  = new Scanner(System.in);
        System.out.println("enter the number of nodes you want to insert");
        int n = Sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("enter the data for the "+(i+1)+"node");
            int data  = Sc.nextInt();
            IE.insert(data);

        }

    }
}
