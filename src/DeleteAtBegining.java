import java.util.*;
public class DeleteAtBegining {
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



        public ListNode deleteBig(){
        if(head == null){
            return null;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
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
        DeleteAtBegining DB  =  new DeleteAtBegining();
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the node size");
        int n = Sc.nextInt();
        System.out.println("enter the lements of the the Linked List");
        for(int i=0;i<n; i++){
            int data = Sc.nextInt();
            DB.insert(data);
        }
        System.out.println("deleted one is"+DB.deleteBig().data);
        System.out.println("deleted one is"+DB.deleteBig().data);

        DB.display();

    }
}
