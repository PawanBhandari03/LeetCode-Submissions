import java.util.Scanner;

public class Q26_CheckIfArrayIsSorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i< n ; i++){
            arr[i] = sc.nextInt();
        }
        boolean sorted = false;
        for(int i = 0; i<n-1; i++){
            if(arr[i] < arr[i+1]){
                    sorted = true;
                    break;
            }
        }
        System.out.println(sorted ? "Sorted":"NotSorted");
    }
}
