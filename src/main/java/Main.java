import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] arg) {
        System.out.println("Enter number to build multiplication table");
        int input = keyboard.nextInt();
        int nextInt = 1;
        int product = 1;

        while (nextInt <= input) {
            for (int i = 1; i <= input; i++) {
                product = nextInt * i;
                System.out.println(" " + nextInt + " x " + i + " = " + product);

            }
            System.out.println("---multiples of " + nextInt + "----------");
            nextInt++;
        }
    }
}




