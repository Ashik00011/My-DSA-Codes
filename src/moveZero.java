
public class moveZero {

    public void Printer(int [] arr){
        for(int i=0; i< arr.length; i++){
        }
    }

    public void demo(int[] arr, int n) {
        int  j = 0;
        for(int i=0; i<n; i++){
            if (arr[i] !=0 && arr[j]==0){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            if (arr[j] != 0){
                j++;
            }
        }
        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
            Printer(arr);
        }

    }

    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 4, 2};
        moveZero M = new moveZero();
        M.demo(arr, arr.length);
    }
}
