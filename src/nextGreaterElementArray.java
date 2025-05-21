public class nextGreaterElementArray {
    public static void main(String[] args){
        int [] find = new int[10];
    int[] arr = {4, 7, 3, 4, 8, 1};

    for (int i = 0; i < arr.length; i++) {
        for(int j=i; j<arr.length; j++){
            if(arr[j] > arr[i] ){
                find[i] = arr[j];
                break;
            }
            else{
                find[i] = -1;
            }
        }

    }
        for (int i = 0; i < arr.length; i++) {

            System.out.println(find[i]);
        }

    }
}
