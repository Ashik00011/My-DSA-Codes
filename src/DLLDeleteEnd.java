import java.util.NoSuchElementException;
import java.util.Scanner;

public class DLLDeleteEnd {
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
        public DLLDeleteEnd(){
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
                System.out.print(temp.data+"--->");
                temp = temp.next;
            }
            System.out.print("null");
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
            System.out.println(head.data+"this is head");
            System.out.println(tail.data+"this is tail");

        }

        public ListNode deleteEnd(){
            if (isEmpty()){
                throw new NoSuchElementException();
            }
            ListNode temp = tail;
            if(head == tail){
                tail=head = null;
            }
            else{
                tail.previous.next = null;
                tail = tail.previous;
                temp.previous = null;
            }
            return temp;


        }

        public static void main(String [] args){
            DLLDeleteEnd DF = new DLLDeleteEnd();
            Scanner Sc = new Scanner(System.in);
            System.out.println("enter the number of nodes");
            int n = Sc.nextInt();

            for (int i=1; i<=n; i++){
                System.out.println("enter the numbers");
                int values = Sc.nextInt();
                DF.insert(values);
            }
            System.out.println(DF.deleteEnd().data+"the deleted one is this");
            DF.display();
        }

    }


