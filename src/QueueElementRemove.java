import java.util.Scanner;

public class QueueElementRemove {
        private ListNode rear;
        private ListNode front;
        private int length;

        class ListNode {
            int data;
            private ListNode next;

            public ListNode(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public QueueElementRemove() {
            rear = null;
            front = null;
            length = 0;
        }

        public int length() {
            return length;
        }

        public boolean isEmpty() {
            return length == 0;
        }

        public void display() {
            ListNode temp = front;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void insertElelment(int data) {
            ListNode temp = new ListNode(data);
            if(isEmpty()){
                front = temp;
            }
            else{
                rear.next = temp;
            }
            rear = temp;
            length ++;
        }

        public void elementRemove(){
            ListNode temp = front;
            if(isEmpty()){
                return;
            }
            else{
                if(length == 1) {
                    front = null;
                    rear = null;
                }
                else{
                    front = temp.next;
                    temp.next = null;

                }
                length --;

            }
        }

        public static void main(String [] args){
            QueueElementRemove QI = new QueueElementRemove();
            Scanner S = new Scanner(System.in);
            System.out.println("eneter the number of elelments");
            int number = S.nextInt();

            for(int i=1; i<=number; i++){
                System.out.println("eneter the elements you want to insert");
                int data = S.nextInt();

                QI.insertElelment(data);
            }
            QI.display();
            QI.elementRemove();
            QI.elementRemove();
            QI.elementRemove();
            QI.elementRemove();

            QI.display();
        }

    }



