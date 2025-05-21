import java.util.*;
public class TakingInputFromUser {
    private ListNode head;
    public static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void Insert(int data){
        ListNode newNode = new ListNode(data);
        if (head == null){
            head = newNode;
        }
        else{
            ListNode current = head;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printNum(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current= current.next;
        }
    }



    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        TakingInputFromUser TI = new TakingInputFromUser();

        System.out.println("enter the number of nodes");
        int n = Sc.nextInt();

        for(int i=0; i<n; i++){
            System.out.println("enter the data for the nide" +(i+1)+":");
            int data = Sc.nextInt();
            TI.Insert(data);
        }
        TI.printNum();
    }
}
