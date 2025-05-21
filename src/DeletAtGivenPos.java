import java.util.*;
public class DeletAtGivenPos {
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



    public ListNode deleteEnding(int position){
        ListNode current = null;
       if(head == null){
           return head;
       }
       else if(position == 1){
           head = head.next;
       }
       else{
           ListNode prev = head;
           int count = 1;
           while(count < position-1){
               prev = prev.next;
               count++;
           }
           current = prev.next;
           prev.next = current.next;
           current.next = null;

       }
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
        DeletAtGivenPos DB  =  new DeletAtGivenPos();
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the node size:");
        int n = Sc.nextInt();
        System.out.println("Enter the elements of the Linked List:");
        for(int i = 0; i < n; i++){
            int data = Sc.nextInt();
            DB.insert(data);
        }
        DB.display();

        ListNode deletedNode1 = DB.deleteEnding(1);
        if(deletedNode1 != null){
            System.out.println("Deleted one is " + deletedNode1.data);
        }
        DB.display();

        ListNode deletedNode2 = DB.deleteEnding(3);
        if(deletedNode2 != null){
            System.out.println("Deleted one is " + deletedNode2.data);
        }
        DB.display();
    }

}
