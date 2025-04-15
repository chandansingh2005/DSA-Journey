import java.util.*;

public class diceFaceProblem {
    // The dice problem
    public static int FacingProblem(int n) {
        int ans = 0;
        if (n == 1) {
            ans = 6;

        } else if (n == 2) {
            ans = 5;

        } else if (n == 3) {
            ans = 4;

        } else if (n == 4) {
            ans = 3;

        } else if (n == 5) {
            ans = 2;

        } else {
            ans = 1;
        }
        return ans;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(FacingProblem(n));

    }

}
