import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {



        System.out.println(findodd(14));


        }
    static int findodd(int input) {
        if (input == 1) {
            return 1;
        }
        if (input %2 != 0) {
            System.out.println(input);
            findodd(input - 2);
        }
        if (input %2==0) {
            System.out.println(input);
            findodd(input - 1);
        }

        return 1;
    }

}