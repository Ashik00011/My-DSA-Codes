import java.util.*;
public class Minimum {
    public static void min(int [] arr){
        if (arr.length == 0){
            throw new IllegalArgumentException("invalid input");
        }
        int max = arr[0];
        int SM = Integer.MIN_VALUE;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    SM = max;
                    max = arr[i];

                }
                else if(arr[i]> SM && arr[i]!= max){
                    SM = arr[i];
                }





            }


        System.out.println(SM);
        System.out.println(max);
    }
    public static void main(String [] args){
        Scanner SC = new Scanner(System.in);
        System.out.println("eneter the array elements");
        int n = SC.nextInt();
        int [] arr = new int[n];
        System.out.println("eneter the array elements");
        for(int i=0; i<n ; i++){
            arr[i] = SC.nextInt();


        }
        Minimum M = new Minimum();
        M.min(arr);

     }
}
