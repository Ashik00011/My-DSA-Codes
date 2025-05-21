import java.util.*;

public class UnoiqueElementArray {





    public static void main(String [] args){
        UnoiqueElementArray UA = new UnoiqueElementArray();
        Scanner S = new Scanner(System.in);
        int count = 0;
        System.out.println("enter the number of ellement you want to insert in to the element");
        int n = S.nextInt();
        int [] element = new int[n];
        int [] newOne = new int[n];
        boolean newArray = false;
        for(int i=0; i<n; i++){
            System.out.println("enter the element you want to insert it into the array");
            int value = S.nextInt();
            element [i] = value;


        }
        for(int i=0; i<n ; i++){
            System.out.println(element[i]);
        }

        for(int i=0; i<n ; i++){
            for(int j=0; j<count; j++){
                    if (element[i] == newOne[j]){
                        newArray = true;


                }
            }
            if(! newArray){
                newOne[count] = element[i];
                count++;
            }

        }

        System.out.print("Array without duplicates: ");
        for (int i = 0; i <= count; i++) {
            System.out.print(newOne[i] + " ");
        }




    }

}
