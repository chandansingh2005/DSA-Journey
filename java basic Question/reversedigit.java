public class reversedigit {
    // write a program to reverse digit of a number
    public static int reverse(int n) {
        int rev = 0;
        while (n != 0) {
            int last = n % 10;
            rev = (rev * 10) + last;
            n = n / 10;

        }
        return rev;

    }

    public static void main(String args[]) {
        int n = 654987;
        System.out.println(reverse(n));
    }

}
