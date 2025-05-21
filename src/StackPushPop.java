import java.util.*;
public class StackPushPop {
    private ListNode top;
    private int length;

    public class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }


    }

    public StackPushPop(){
        top = null;
        length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }
    public void dispaly(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        else{
            ListNode temp = top;
            while(temp != null){
                System.out.println(temp.data+"-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }
    public void insert(int val){
        ListNode newOne = new ListNode(val);
        if (isEmpty()){
            top = newOne;
        }
        else{
            newOne.next = top;
            top = newOne;
        }
        length++;
    }

    public void pop(){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        else{
            ListNode temp = top;
            top = top.next;
            temp.next = null;
        }
        length --;
    }


    public int peek(){
        return top.data;
    }



    public static void main(String [] args){
        StackPushPop SPP = new StackPushPop();
        Scanner S  = new Scanner(System.in);
        System.out.println("entert he number of elements");
        int n = S.nextInt();
        for (int i=1; i<=n; i++){
            System.out.println("enter the elements you want to insert");
            int number = S.nextInt();
            SPP.insert(number);
        }
        SPP.dispaly();

       System.out.println(SPP.peek());

       SPP.pop();
       SPP.dispaly();
       System.out.println(SPP.peek());



    }

}
