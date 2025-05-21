import java.util.Scanner;

public class QueueInsertion {
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

    public QueueInsertion() {
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

    public static void main(String [] args){
        QueueInsertion QI = new QueueInsertion();
        Scanner S = new Scanner(System.in);
        System.out.println("eneter the number of elelments");
        int number = S.nextInt();

        for(int i=1; i<=number; i++){
            System.out.println("eneter the elements you want to insert");
            int data = S.nextInt();

            QI.insertElelment(data);
        }
        QI.display();
    }

}


C:\Users\ashik\IdeaProjects\Practice1\src\QueueInsertion.java