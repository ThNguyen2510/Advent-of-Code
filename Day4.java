import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day4 {
    public Day4()
    {

    }
    public static void pairs() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/thomas/Desktop/AdventCode/src/input4"));
        int overlap = 0;
        int overlap2 = 0;

        while(scanner.hasNext()) {
            String zeile = scanner.nextLine();
            zeile = zeile.replaceAll("-", ",");
            String[] numbers = zeile.split(",");
            int[] pairs = new int[numbers.length];

            for( int i= 0; i< numbers.length; i++)
            {
                pairs[i] =Integer.parseInt(numbers[i]) ;
            }
            //part1
            /*if(pairs[0]<= pairs[2] && pairs[1]>= pairs[3])
            {
                overlap++;
            } else if (pairs[2]<= pairs[0] && pairs[3]>= pairs[1]) {
                overlap++;
            }
           */
            //part2
            for(int i = 0;i< pairs.length;i++ )
            {
                if(pairs[0]>=pairs[2]&&pairs[0]<=pairs[3]) {
                    overlap2++;
                    break;
                } else if (pairs[1]>=pairs[2]&&pairs[0]<=pairs[3]) {
                    overlap2++;
                    break;
                }
                else if (pairs[2]>=pairs[0]&&pairs[2]<=pairs[1]) {
                    overlap2++;
                    break;
                }
                else if (pairs[3]>=pairs[0]&&pairs[3]<=pairs[1]) {
                    overlap2++;
                    break;
                }



            }


        }
        System.out.println("Du hast "+overlap2+" überschneidungen");
    }
}

