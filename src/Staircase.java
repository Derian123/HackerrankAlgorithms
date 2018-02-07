/**
 * Created by derianescobar on 2/7/18.
 */
import java.util.Scanner;

public class Staircase{

    static void staircase(int n) {
        int count = -1;
        int spaces = 1;


        for(int i = 0; i < n; i++){

            for(int j = spaces; j < n; j++){

                System.out.print(" ");


            }
            while(count != i){
                System.out.print("#");
                count++;
            }
            count = -1;
            spaces++;
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        staircase(n);
        in.close();
    }
}
