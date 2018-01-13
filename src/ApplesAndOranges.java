/**
 * Created by derianescobar on 1/12/18.
 */
import java.util.Scanner;

public class ApplesAndOranges{

    //s = point a of the home
    //t = point b of the home

    //a = the position of the apple tree
    //b = the position of the orange tree
    static int[] appleAndOrange(int s, int t, int a, int b, int[] apple, int[] orange) {
        // Complete this function

        int distance;
        int appleCount = 0;
        int orangeCount = 0;

        int[] fruits = new int[2];

        for(int i = 0; i < apple.length; i++){

            distance = a + apple[i];

            if(s <= distance && distance <= t){

                appleCount++;
            }

            fruits[0] = appleCount;
        }

        for(int i = 0; i < orange.length; i++){

            distance = b + orange[i];

            if(s <= distance && distance <= t){

                orangeCount++;
            }
            fruits[1] = orangeCount;
        }

        return fruits;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i = 0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i = 0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int[] result = appleAndOrange(s, t, a, b, apple, orange);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}