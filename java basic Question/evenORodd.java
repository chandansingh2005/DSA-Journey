import java.util.*;
import java.util.Scanner;

public class evenORodd {

    // check number even or odd
    public static boolean checkNumber(int n) {
        // check condition
        if (n % 2 == 0) {
            return true;

        }
        return false;

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(checkNumber(n));
    }

}
