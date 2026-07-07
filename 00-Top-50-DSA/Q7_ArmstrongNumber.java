import java.util.Scanner;

public class Q7_ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numStr = Integer.toString(n);
        int k = numStr.length();
        int Ogno = n;
        int sum = 0;

        while(n>0){
            int lastdigit = n % 10;
            sum += Math.pow(lastdigit,k);
            n = n / 10;
        }
        System.out.println(Ogno == sum ? "Armstrong" : "NotArmstrong");
    }
}
