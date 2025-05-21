import java.util.Stack;

public class CheckInputValid {
    public boolean isValid(String S){
        Stack <Character> stack = new Stack<>();
        for(char c : S.toCharArray()){
            if((c == '{' )|| (c== '(')|| c=='['){
                stack.push(c);
            }
            else{
                if (stack.isEmpty()){
                    return false;
                }
                else{
                    char top = stack.peek();
                    if((c =='}' && top=='{')||(c ==')' && top=='(')||(c ==']' && top=='[')){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
            }
        }



        return stack.isEmpty();
    }
    public static void main(String[] args) {
        CheckInputValid C = new CheckInputValid();

       System.out.println(C.isValid("{()]}"));
            }
}