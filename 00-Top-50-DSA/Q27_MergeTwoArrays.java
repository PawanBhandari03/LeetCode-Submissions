import java.util.Scanner;

public class Q27_MergeTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int [] a = new int[n1];
        for(int i = 0; i< n1; i++){
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int [] b = new int[n1];
        for(int i = 0; i< n1; i++){
            b[i] = sc.nextInt();
        }

        int[] merged = new int [n1+n2];
        for (int i = 0;i<n1; i++){
            merged [i] = a[i];
        }
        for(int i=0 ;i<n2;i++){
            merged[n1+i] = b[i];
        }
        for(int num : merged){
            System.out.print(num + " ");
        }
    }
}
