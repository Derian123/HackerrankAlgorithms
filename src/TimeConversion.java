/**
 * Created by derianescobar on 1/12/18.
 */
import java.util.Scanner;

public class TimeConversion {


    static String timeConversion(String s) {

        String times [] = s.split(":");
        String seconds = times[2].substring(0,2);
        String extension = times[2].substring(2);
        String result = "";

        if(extension.equals("AM"))
        {
            int hour = Integer.parseInt(times[0]);

            if(hour == 12)
            {
                hour = 0;

                result += hour;
                result += hour + ":"; //result = 00
                result += times[1] + ":";
                result += seconds;

            }

            else {
                for (int i = 0; i < times.length - 1; i++) {

                    result += times[i] + ":";
                }
                result += seconds;
            }




        }

        else{
            int hour = Integer.parseInt(times[0]);

            if(hour == 12)
            {
                for(int i = 0; i < times.length-1; i++){

                    result += times[i] + ":";

                }
                result+= seconds;
            }
            else
            {
                hour += 12;

                result += hour + ":";
                result += times[1] + ":";
                result += seconds;
            }


        }

        return result;
        // Complete this function

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
