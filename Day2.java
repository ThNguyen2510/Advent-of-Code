import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class Day2
{
    public Day2()
    {

    }
    public static void gameResult() throws FileNotFoundException {
        int score = 0;
        int score2 =0;
        Scanner scanner = new Scanner(new File("/Users/thomas/Desktop/AdventCode/src/input2"));
        String [] input = new String [2500];
        int i = 0;
        String zeile = "";
        while(i < 2500){
            zeile = scanner.nextLine();
            zeile = zeile.replaceAll("\\s","");
            input[i]= zeile;
            i++;

        }

        for(int j = 0; j< input.length; j++)
        {
            if (Objects.equals(input[j], "AX")) {
                score = score +4;
                score2= score2 +3;
            }
            else if (Objects.equals(input[j], "AY")) {
                score = score +8;
                score2= score2 +4;
            }
            else if (Objects.equals(input[j], "AZ")) {
                score = score +3;
                score2= score2 +8;
            }
            else if (Objects.equals(input[j], "BX")) {
                score = score +1;
                score2= score2 +1;
            }
            else if (Objects.equals(input[j], "BY")) {
                score = score +5;
                score2= score2 +5;
            }
            else if (Objects.equals(input[j], "BZ")) {
                score = score +9;
                score2= score2 +9;
            }
            else if (Objects.equals(input[j], "CX")) {
                score = score +7;
                score2= score2 +2;
            }
            else if (Objects.equals(input[j], "CY")) {
                score = score +2;
                score2= score2 +6;
            }
            else if (Objects.equals(input[j], "CZ")) {
                score = score +6;
                score2= score2 +7;
            }
        }
        System.out.println("Du hast "+ score +" Punkte!");
        System.out.println("Du hast "+ score2 +" Punkte!");






    }

}
