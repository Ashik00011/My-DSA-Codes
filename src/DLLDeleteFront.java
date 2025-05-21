import java.util.*;

public class DLLDeleteFront {
    ListNode head;
    ListNode tail;
    int length;

    public class ListNode{
        int data;
        ListNode next;
        ListNode previous;

        public ListNode(int data){
        this.data = data;
        }

    }
    public DLLDeleteFront(){
        head = null;
        tail = null;
        length = 0;

    }

    public boolean isEmpty(){
        return (length == 0);

    }
    public void display(){
        ListNode temp = head;
        while(temp != null){
            System.out.println(temp.data+"--->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void insert(int value){
        ListNode newNode = new ListNode(value);
        if (isEmpty()){
            tail= newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next = head;
        head  = newNode;
        length ++;
    }

    public void deletefrnt(){
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        ListNode temp = head;
        if(head == tail){
            tail = null;
        }
        else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;


    }

    public static void main(String [] args){
        DLLDeleteFront DF = new DLLDeleteFront();
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = Sc.nextInt();

        for (int i=1; i<n; i++){
            System.out.println("enter the numbers");
            int values = Sc.nextInt();
            DF.insert(values);
        }
        DF.deletefrnt();
        DF.display();
    }

}
