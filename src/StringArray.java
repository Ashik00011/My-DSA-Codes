import java.util.Stack;

public class StringArray {

    public static  String reverse  (String str){
        Stack <Character> stack = new Stack<>();
        char [] arr = str.toCharArray();
        for(int i=0;i<str.length();i++){
            char c = arr[i];
            stack.push(c);
        }

        for(int i=0;i<str.length();i++){
            arr[i] = stack.pop();
        }

        return new String(arr);

    }

    public static void main(String [] args){
       String rev =  StringArray.reverse("ASHIK");
       System.out.println(rev);


    }
}
