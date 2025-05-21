import java.util.*;

public class CircularLL {
    ListNode last;
    int length;

    public class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularLL() {
        last = null;
        length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }
    public void display(){
        if(last == null){
            return;
        }else{
            ListNode first = last.next;
            while(first != last){
                System.out.println(first.data+"-->");
                first = first.next;
            }
            System.out.println(first.data+"-->");

        }
    }

    public void insert(int data){
        ListNode NewOne = new ListNode(data);
        if (isEmpty()) {
            last = NewOne;
            last.next = NewOne;
        }
        else{
            NewOne.next = last.next;
            last.next = NewOne;
            last = NewOne;
        }
        length ++;
        System.out.println(last.data);

    }
    public static void main(String [] args){
        CircularLL CLL = new CircularLL();
        Scanner S = new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n = S.nextInt();
        for(int i=1; i<= n; i++){
            System.out.println("enter the nodes elements");
            int numbers = S.nextInt();
            CLL.insert(numbers);
        }
        CLL.display();
    }

}
