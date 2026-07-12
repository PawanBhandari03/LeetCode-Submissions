import java.util.HashSet;
import java.util.Scanner;

public class Q45_FindIntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int [] a = new int [n1];
        for(int i =0; i<n1; i++){
            a[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int [] b = new int [n2];
        for(int i =0; i<n2; i++){
            b[i] = sc.nextInt();
        }

        HashSet <Integer> set = new HashSet<>();
        for(int i= 0; i< n1; i++){
            set.add(a[i]);
        }
        for(int i = 0; i< n2; i++){
            if(set.contains(b[i])){
                System.out.println(b[i]);
                set.remove(b[i]);
            }
        }
    }
}
