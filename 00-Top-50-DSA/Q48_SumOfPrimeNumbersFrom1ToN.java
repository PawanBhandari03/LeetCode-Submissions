import java.util.Scanner;

public class Q48_SumOfPrimeNumbersFrom1ToN {
    public static boolean isPrime(int n) {
        Scanner sc = new Scanner(System.in);
        if (n <= 1)
            return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i))
                sum += i;
        }
        System.out.println(sum);
    }
}


