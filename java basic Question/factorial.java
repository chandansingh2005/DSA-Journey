import java.util.*;

public class factorial {

    // print the factorial number
    public static int printFactorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String args[]) {
        int n = 7;
        System.out.println(printFactorial(n));
    }

}
