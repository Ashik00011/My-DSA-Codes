public class NodeCount {
    private ListNode head;
    public static class ListNode {
        private int data;
        private ListNode next;


        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
        public  void countNumber(){
            int count = 0;
            ListNode current  = head;
            while(current != null){
                count ++;
                current = current.next;
            }
            System.out.println("the linked list contains " + count + " number of elements");
        }

        public static void main(String [] args){
            NodeCount NC = new NodeCount();
            NC.head = new ListNode(10);
            ListNode second = new ListNode(20);
            ListNode third = new ListNode(30);
            ListNode fourth = new ListNode(40);



            NC.head.next = second;
            second.next = third;
            third.next = fourth;

            NC.countNumber();


        }
    }

