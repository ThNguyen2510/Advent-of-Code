import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Day3 {
    public Day3() {

    }

    public static int rucksack() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/thomas/Desktop/AdventCode/src/input3"));

        char ch = 'a';
        int pos = 0;
        int wert = 0;
        boolean dupe,dupe2;

        while (scanner.hasNext()) {
            String zeile = scanner.nextLine();
            char[] rucksack = zeile.toCharArray();
            int size = rucksack.length;
            char[] firstHalf = Arrays.copyOfRange(rucksack, 0, size / 2);
            String secondHalf = zeile.substring(size/2);
            for(char c: firstHalf)
            {
                if(secondHalf.indexOf(c)>=0)
                {
                    if (Character.isLowerCase(c)) {
                        wert = wert + (c - 'a' + 1);
                    }
                    else
                    {
                        wert = wert + (c - 'a' + 1)+58;
                    }
                    break;

                }
            }


        }
        System.out.println("Dein Wert ist " + wert);
        return wert;
    }
    public static int group() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/thomas/Desktop/AdventCode/src/input3"));
        int summe = 0;

        while (scanner.hasNext()) {


            String zeile1 = scanner.nextLine();
            String zeile2 = scanner.nextLine();
            String zeile3 = scanner.nextLine();
            char[] erster = zeile1.toCharArray();
            for (char c : erster) {
                if (zeile2.indexOf(c) >= 0) {
                    if (zeile3.indexOf(c) >= 0) {
                        if (Character.isLowerCase(c)) {
                            summe = summe + (c - 'a' + 1);
                        } else {
                            summe = summe + (c - 'a' + 1) + 58;
                        }
                        break;

                    }

                }
            }
        }
        System.out.println("Dein Wert ist "+summe);
        return summe;
    }
}
