import java.util.Scanner;
/**
 * Created by derianescobar on 1/24/18.
 */
public class AVeryBigSum {

    static long aVeryBigSum(int n, long[] ar) {
        // Complete this function
        long total = 0;

        for(int i = 0; i < ar.length; i++){

            total += ar[i];
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] ar = new long[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextLong();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }

}
