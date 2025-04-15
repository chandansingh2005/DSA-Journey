import java.util.*;

public class multiplication {

    // print multiplication table
    public static void printtable(int n) {
        int tab = 1;
        for (int i = 1; i <= 10; i++) {
            tab = i * n;

            System.out.println(n+" * "+i +"=" + tab);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        printtable(n);

    }

}
