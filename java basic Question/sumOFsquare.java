public class sumOFsquare {
    // Program for Sum of squares of first n natural numbers
    public static int sumOfnnatural(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += (i*i);
        }
        return sum;
    }

    public static void main(String args[]) {
        int n = 8;
        System.out.println(sumOfnnatural(n));

    }

}
