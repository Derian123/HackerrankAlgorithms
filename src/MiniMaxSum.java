import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by derianescobar on 1/30/18.
 */
public class MiniMaxSum {

    static void miniMaxSum(int[] arr) {
        // Complete this function

        Arrays.sort(arr);

        long minSum = 0;
        long maxSum = 0;

        for(int i = 0; i < arr.length-1; i++){

            minSum+= arr[i];
        }
        for(int i = 1; i < arr.length; i++){

            maxSum+= arr[i];
        }

        System.out.println(minSum + " " + maxSum);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i = 0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        miniMaxSum(arr);
        in.close();
    }

}
