import java.util.*;
public class InsertAtSpecificPosition {
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
        if(head == null){
            System.out.println("the linkedList is empty");
        }else{
            ListNode current = head;
            while(current != null){
                System.out.print(current.data+"-->");
                current = current.next;
            }

        }
    }

    public void Insert(int data){

        Scanner S = new Scanner(System.in);
        System.out.println("eter the position you want to insert");
        int position = S.nextInt();
        if (position == 1) {
            ListNode newOne = new ListNode(data);
            if (head == null) {
                head = newOne;
            } else {
                newOne.next = head;
                head = newOne;
            }
        }
        else{
            ListNode newOneT = new ListNode(data);
            ListNode prev = head;
            int count = 1;
            while(count < position-1){
                count = count+1;
            }
            ListNode cur = prev.next;
            newOneT.next = cur;
            prev.next = newOneT;
        }
    display();
    }

    public static void main(String [] args){
        InsertAtSpecificPosition IP = new InsertAtSpecificPosition();
        Scanner SC = new Scanner(System.in);
        System.out.println("enter the number of nodes you want to insert");
        int n = SC.nextInt();
        for(int i=0; i<n ; i++){
            System.out.println("enter the elements you want to insert");
            int data = SC.nextInt();
            IP.Insert(data);
        }

    }
}
