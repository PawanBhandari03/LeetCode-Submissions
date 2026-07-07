import java.util.*;
public class Q2_CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            boolean Prime = true;
            if(n <= 1)
                Prime = false;
            for(int i =2; i < Math.sqrt(n); i++){
                if(n % 2 == 0){
                    Prime = false;
                    break;
                }
        }
        System.out.println(Prime ? "Prime" : "Not Prime");
    }
}
