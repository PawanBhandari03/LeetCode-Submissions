import java.util.HashMap;
import java.util.Scanner;

public class Q50_TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i =0; i< n;i++){
            arr[i] = sc.nextInt();
        }

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i< n; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                System.out.println(map.get(complement)+" "+i);
                }
            else{
                map.put(arr[i] , i);
            }
        }
    }
}
