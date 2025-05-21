import java.util.*;
public class DeleteEnd {
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode (int data){
            this.data = data;
            this.next = null;
        }
    }

    public void display(){
        if(head == null){
            System.out.print("the list is empty");
        }
        else{
            ListNode current = head;
            while(current != null){
                System.out.println(current.data+"-->");
                current = current.next;
            }
        }
    }



    public ListNode deleteEnding(){
        if(head == null || head.next == null){
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while(current.next != null){
            prev = current;
            current = current.next;
        }
        prev.next = null;
        return current;
    }


    public void insert(int data){
        ListNode newOne = new ListNode(data);
        if(head == null){
            head = newOne;
        }
        else{
            ListNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newOne;
        }
        display();


    }


    public static void main(String [] args){
        DeleteEnd DB  =  new DeleteEnd();
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the node size");
        int n = Sc.nextInt();
        System.out.println("enter the lements of the the Linked List");
        for(int i=0;i<n; i++){
            int data = Sc.nextInt();
            DB.insert(data);
        }
        System.out.println("deleted one is"+DB.deleteEnding().data);
        System.out.println("deleted one is"+DB.deleteEnding().data);

        DB.display();

    }
}
