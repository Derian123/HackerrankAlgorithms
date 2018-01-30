import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by derianescobar on 1/30/18.
 */
public class BithdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function

        Arrays.sort(ar);

        int max = ar[ar.length-1];
        int count = 0;

        for(int i = 0; i < ar.length; i++){

            if(ar[i] == max){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

}
