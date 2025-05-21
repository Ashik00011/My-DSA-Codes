import java.util.Scanner;

public class InsertInSortedOne {
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

        public ListNode insertAtPos(int data) {
            ListNode newOne = new ListNode(data);

            ListNode current = head;
            ListNode temp = null;
            if (head == null) {
                head = newOne;
            } else {
                while (current != null && current.data < newOne.data) {
                    current = current.next;
                    temp = current;
                }
                newOne.next = current;
                temp.next = newOne;

            }
            return head;

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
            InsertInSortedOne DB  =  new InsertInSortedOne();
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter the node size:");
            int n = Sc.nextInt();
            System.out.println("Enter the elements of the Linked List:");
            for(int i = 0; i < n; i++){
                int data = Sc.nextInt();
                DB.insert(data);
            }
            DB.display();
            DB.insertAtPos(5);
            DB.display();


        }

    }

