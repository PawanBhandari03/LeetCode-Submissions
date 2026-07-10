import java.util.Scanner;

public class Q39_PowerOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Base = sc.nextInt();
        int Power = sc.nextInt();
        int result = 1;

        while(Power > 0){
            if( Power % 2 == 1){
                result = result * Base;
            }
                Base = Base * Base;
                Power = Power/2;
        }
        System.out.println(result);
    }
}
