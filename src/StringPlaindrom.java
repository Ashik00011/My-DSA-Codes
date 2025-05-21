import java.util.*;

public class StringPlaindrom {
    public boolean palindrom(String word){
        char [] charArray = word.toCharArray();
        System.out.println(charArray);
        int start = 0;
        int end = word.length()-1;
        while(start < end){
            if (charArray[start] != charArray[end]){
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
    public static void main(String [] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the String you want to reverse");
        String vari = SC.nextLine();
        System.out.println(vari);
        StringPlaindrom SP = new StringPlaindrom();
        if (SP.palindrom(vari)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
