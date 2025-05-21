import java.util.Scanner;

public class FindNthnode {
    private ListNode head;

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        if (head == null) {
            System.out.print("the list is empty");
        } else {
            ListNode current = head;
            while (current != null) {
                System.out.println(current.data + "-->");
                current = current.next;
            }
        }
    }


    public ListNode deleteEnding() {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode current = head;
        ListNode prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        prev.next = null;
        return current;
    }


    public void insert(int data) {
        ListNode newOne = new ListNode(data);
        if (head == null) {
            head = newOne;
        } else {
            ListNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newOne;
        }
        display();


    }


    public ListNode Find(int pos) {
        ListNode mptr = head;
        ListNode ptr = head;
        int count = 0;
        while (count < pos) {
            ptr = ptr.next;
            count++;
        }
        while (ptr != null) {
            mptr = mptr.next;
            ptr = ptr.next;
        }
        return mptr;
    }


        public static void main (String[]args){
            FindNthnode DB = new FindNthnode();
            Scanner Sc = new Scanner(System.in);
            System.out.println("enter the node size");
            int n = Sc.nextInt();
            System.out.println("enter the lements of the the Linked List");
            for (int i = 0; i < n; i++) {
                int data = Sc.nextInt();
                DB.insert(data);
            }

            DB.display();


            System.out.println("element is" + DB.Find(2).data);


        }
    }




