import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day5 {
    public Day5()
    {



    }
    public static <Individual> void crane() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("/Users/thomas/Desktop/AdventCode/src/input5"));
        List<Stack<Character>> ship = new ArrayList<Stack<Character>>();


        Stack<Character> stack1 = new Stack<>();
        stack1.push('W');
        stack1.push('D');
        stack1.push('G');
        stack1.push('B');
        stack1.push('H');
        stack1.push('R');
        stack1.push('V');
        ship.add(stack1);


        Stack<Character> stack2 = new Stack<>();
        stack2.push('J');
        stack2.push('N');
        stack2.push('G');
        stack2.push('C');
        stack2.push('R');
        stack2.push('F');
        ship.add(stack2);


        Stack<Character> stack3 = new Stack<>();
        stack3.push('L');
        stack3.push('S');
        stack3.push('F');
        stack3.push('H');
        stack3.push('D');
        stack3.push('N');
        stack3.push('J');
        ship.add(stack3);


        Stack<Character> stack4 = new Stack<>();
        stack4.push('J');
        stack4.push('D');
        stack4.push('S');
        stack4.push('V');
        ship.add(stack4);


        Stack<Character> stack5 = new Stack<>();
        stack5.push('S');
        stack5.push('H');
        stack5.push('D');
        stack5.push('R');
        stack5.push('Q');
        stack5.push('W');
        stack5.push('N');
        stack5.push('V');
        ship.add(stack5);


        Stack<Character> stack6 = new Stack<>();
        stack6.push('P');
        stack6.push('G');
        stack6.push('H');
        stack6.push('C');
        stack6.push('M');
        ship.add(stack6);


        Stack<Character> stack7 = new Stack<>();
        stack7.push('F');
        stack7.push('J');
        stack7.push('B');
        stack7.push('G');
        stack7.push('L');
        stack7.push('Z');
        stack7.push('H');
        stack7.push('C');
        ship.add(stack7);


        Stack<Character> stack8 = new Stack<>();
        stack8.push('S');
        stack8.push('J');
        stack8.push('R');
        ship.add(stack8);


        Stack<Character> stack9 = new Stack<>();
        stack9.push('L');
        stack9.push('G');
        stack9.push('S');
        stack9.push('R');
        stack9.push('B');
        stack9.push('N');
        stack9.push('V');
        stack9.push('M');
        ship.add(stack9);

        String zeile = null;
        int[] anweisung = new int[0];
        char[] crane9001 = new char[40];
        while (scanner.hasNext()) {
            zeile = scanner.nextLine();
            zeile = zeile.replaceAll("[^0-9\\s]", "");

            zeile = zeile.trim().replaceAll(" +", " ");
            zeile = zeile.replaceAll(" ", ",");
            String[] numbers = zeile.split(",");
            anweisung = new int[numbers.length];

            for (int i = 0; i < numbers.length; i++) {
                anweisung[i] = Integer.parseInt(numbers[i]);
            }
            //part1
            int anzahl = anweisung[0];
            int from = anweisung[1];
            int to = anweisung[2];
            char memory = 'a';

            /*for (int i = anzahl; i > 0; i--) {
                memory = ship.get(from - 1).pop();
                ship.get(to - 1).push(memory);
            }

             */

            for(int z = 0; z < anzahl;z++)
            {
               crane9001[z] = ship.get(from - 1).pop();
            }
            for(int b = anzahl-1; b >= 0;b--)
            {
                ship.get(to - 1).push(crane9001[b]);
            }


        }
        for (Stack<Character> characters : ship) {
            System.out.print(characters.peek());
        }
        System.out.println(zeile);
        System.out.println(Arrays.toString(ship.toArray()));
        System.out.println(Arrays.toString(anweisung));
        System.out.println(ship.get(0));
    }
}
