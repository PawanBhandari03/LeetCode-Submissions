import java.util.Scanner;

public class Q11_LcmOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = a , y = b;
        while(y != 0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        int GCD = x;
        int LCM = (a%b)/GCD;

        System.out.println(LCM);
    }
}
