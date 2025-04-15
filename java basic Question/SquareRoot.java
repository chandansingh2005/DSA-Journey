public class SquareRoot {

    // Program for Square Root of Integer
    public static int floorSquare(int n) {
        int res = 1;
        while (res * res <= n) {
            res++;

        }
        return res - 1;

    }

    public static void main(String args[]) {
        int n = 11;
        System.out.println(floorSquare(n));
    }

}
