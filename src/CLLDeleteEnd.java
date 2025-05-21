import java.util.NoSuchElementException;
import java.util.Scanner;

public class CLLDeleteEnd {
        private ListNode last;
        private int length;

        public class ListNode {
            private ListNode next;
            private int data;

            public ListNode(int data) {
                this.data = data;
            }
        }

        public CLLDeleteEnd() {
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

        public void insertend(int data) {
            ListNode newNode = new ListNode(data);
            if (isEmpty()) {
                last = newNode;
                last.next = newNode;
            } else {
                newNode.next = last.next;
                last.next = newNode;
                last = newNode;
            }
            length ++;
        }

        public void deleteEnd(){
            if(isEmpty()){
                throw new NoSuchElementException();

            }
            ListNode temp = last.next;
            if(length ==1) {
                last = null;
            }
            else {
                while(temp.next != last){
                    temp = temp.next;
                }
                temp.next = last.next;
                last.next  = null;
                last = temp;
            }
            length --;
        }

        public static void main(String[] args) {
            CLLDeleteEnd CLL = new CLLDeleteEnd();
            Scanner S = new Scanner(System.in);

            System.out.println("Enter the number of nodes:");
            int n = S.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Enter node element " + i + ":");
                int number = S.nextInt();
                CLL.insertend(number);
            }

            System.out.println("Circular Linked List after inserting at front:");
            CLL.display();
            CLL.deleteEnd();
            CLL.display();

        }
    }






