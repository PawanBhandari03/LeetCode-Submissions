import java.util.*;

public class Q16_RemoveDuplicatesFromString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        Set<Character> set = new HashSet<>();

        String result = " ";

        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            if(!set.contains(ch)) {
                set.add(ch);
                result += ch;
            }
        }
        System.out.println(result);
    }
}
