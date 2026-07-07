import java.util.Scanner;

public class Q5_Reverse_A_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int lastdigit = 0;
        int revno = 0;

        while(n > 0){
            lastdigit = n % 10;
            revno = revno * 10 + lastdigit;
            n = n / 10;
        }
        System.out.println(revno);
    }
}
