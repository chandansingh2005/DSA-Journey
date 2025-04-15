public class PrimeNumber {
    // This is check the primme number or not
    public static boolean checkprime(int n) {
        if (n == 1 || n == 2) {
            return true;

        } else if (n % 2 == 0) {
            return false;

        } else {
            return true;
        }
    }

    public static void main(String args[]) {
        int n = 12;
        System.out.println(checkprime(n));
    }

}
