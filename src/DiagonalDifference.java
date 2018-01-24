import java.util.Scanner;
/**
 * Created by derianescobar on 1/24/18.
 */
public class DiagonalDifference {

    static int diagonalDifference(int[][] a) {
        // Complete this function
        int row = a.length;
        int column = a[0].length;

        int increment = 0;
        int diagonal = 0;

        int sumOfPrimary = 0;
        int sumOfSecondary = 0;

        while(diagonal != row || diagonal != column){

            sumOfPrimary += a[diagonal][diagonal];
            diagonal++;

        }

        while(diagonal != 0 || increment != row){
            diagonal--;
            sumOfSecondary += a[increment][diagonal];
            increment++;


        }

        return Math.abs(sumOfPrimary - sumOfSecondary);

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int a_i = 0; a_i < n; a_i++){
            for(int a_j = 0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int result = diagonalDifference(a);
        System.out.println(result);
        in.close();
    }
}
