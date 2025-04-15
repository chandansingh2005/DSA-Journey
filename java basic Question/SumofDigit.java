public class SumofDigit {

    // sum of digits of a number
    public static int sumDigit(int n) {

        int sum = 0;
        while (n != 0) {
            int last = n % 10;
            sum += last;
            n /= 10;

        }
        return sum;
    }

    public static void main(String args[]) {
        int n = 12;
        System.out.println(sumDigit(n));

    }

}
