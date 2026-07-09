import java.util.Scanner;

public class Q21_SelectionSort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i =0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n-1; i++){
            int minIndex = arr[0];
            for(int j = i + 1; j< n; j++){
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
