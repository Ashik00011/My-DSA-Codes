public class RemoveEven {
    int[] remove(int[] arr) {
        int oddCount = 0;
        int n = arr.length;

        // Count the number of odd elements
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                oddCount++;
            }
        }

        // Create a new array for odd numbers
        int[] result = new int[oddCount];
        int idx = 0;

        // Collect odd elements into the result array
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 != 0) {
                result[idx++] = arr[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RemoveEven od = new RemoveEven();
        int[] result = od.remove(new int[]{1, 2, 4, 7, 9, 5, 4});

        // Print the resulting odd array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
