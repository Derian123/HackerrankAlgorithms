import java.util.Scanner;
/**
 * Created by derianescobar on 1/25/18.
 */
public class PlusMinus {

    static void plusMinus(int[] arr) {
        // Complete this function
        int total = arr.length;

        float positive = 0;
        float negative = 0;
        float zero = 0;

        for(int i = 0; i < arr.length; i++){

            if(arr[i] > 0){

                positive++;
            }
            else if(arr[i] < 0){

                negative++;
            }

            else{
                zero++;
            }
        }
        System.out.println(positive/total);
        System.out.println(negative/total);
        System.out.println(zero/total);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        plusMinus(arr);
        in.close();
    }
}
