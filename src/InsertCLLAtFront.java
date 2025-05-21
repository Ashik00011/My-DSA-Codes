import java.util.Scanner;

public class InsertCLLAtFront {
    private ListNode last;
    private int length;

    public class ListNode {
        private ListNode next;
        private int data;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public InsertCLLAtFront() {
        last = null;
        length = 0;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void display() {
        if (last == null) {
            System.out.println("List is empty.");
            return;
        }

        ListNode first = last.next;
        do {
            System.out.print(first.data + " --> ");
            first = first.next;
        } while (first != last.next);
        System.out.println("(head - circular)");
    }

    public void insertFrnt(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            last = newNode;
            last.next = newNode;
        } else {
            newNode.next = last.next;
            last.next = newNode;
        }
        length++;
    }

    public static void main(String[] args) {
        InsertCLLAtFront CLL = new InsertCLLAtFront();
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the number of nodes:");
        int n = S.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter node element " + i + ":");
            int number = S.nextInt();
            CLL.insertFrnt(number);
        }

        System.out.println("Circular Linked List after inserting at front:");
        CLL.display();
    }
}
