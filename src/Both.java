import java.util.*;
public class Both {
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
    public void insertEnd(int value){
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

    public void insert(int value){
        ListNode newNode = new ListNode(value);
        if (head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
        display();
    }

    public static void main(String [] args){
        Both IE =  new Both();
        Scanner Sc  = new Scanner(System.in);
        System.out.println("Enter you want to insert at front or end only input front or end for both enter 'both' ????????????");
        String Select = Sc.nextLine();
        System.out.println("enter the number of nodes you want to insert");
        int n = Sc.nextInt();
        for(int i=0; i<n; i++){
            System.out.println("enter the data for the "+(i+1)+"node");
            int data  = Sc.nextInt();
            if(Select.equalsIgnoreCase("front") ) {
                IE.insert(data);
            }
            else if (Select.equalsIgnoreCase("end")){
                IE.insertEnd(data);

            }
            else{
                System.out.println("not enterd any thing properly");
                return;
            }
        }

    }
}
