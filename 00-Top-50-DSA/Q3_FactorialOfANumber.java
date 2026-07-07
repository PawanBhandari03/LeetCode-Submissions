import java.util.Scanner;

public class Q3_FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num == 0)
            System.out.println(num);
        else {
            long fact = 1;
            for (int i = 1; i <= num; i++) {
                fact = fact * i;
            }
            System.out.println(fact);
        }
    }
}
