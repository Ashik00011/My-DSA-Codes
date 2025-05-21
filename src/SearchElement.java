public class SearchElement {
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

        public boolean middle(int key) {
            ListNode cur = head;
            int count =1;
            while(cur != null) {
                if (cur.data == key) {
                    return true;
                }
                cur = cur.next;
            }

            return false;

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
            SearchElement FM = new SearchElement();
            FM.insert(10);
            FM.insert(20);
            FM.insert(30);
            FM.insert(40);
            FM.insert(50);
            FM.insert(50);


            FM.display();
            if (FM.middle(300)) {
                System.out.print("element found");
            }
            else {
                System.out.print("elements are not found");
            }

        }
    }


