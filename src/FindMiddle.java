public class FindMiddle {
    ListNode head;

    public class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }

    }


    public void display() {
        if (head == null) {
            System.out.println("the list is empty");
        } else {
            ListNode cur = head;
            while (cur != null) {
                System.out.print(cur.data + "--->");
                cur = cur.next;
            }

        }
        System.out.println("null");  // <- add this line

    }

    public ListNode middle() {
        ListNode slw = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slw = slw.next;
            fast = fast.next.next;
        }
        return slw;

    }


    public void insert(int data){
        ListNode newOne = new ListNode(data);

        if(head == null){
            head = newOne;
        }
        else{
            newOne.next = head;
            head = newOne;
        }
    }

    public static void main(String [] args){
        FindMiddle FM = new FindMiddle();
        FM.insert(10);
        FM.insert(20);
        FM.insert(30);
        FM.insert(40);
        FM.insert(50);
        FM.insert(50);


        FM.display();
        System.out.println(FM.middle().data);
    }
}
