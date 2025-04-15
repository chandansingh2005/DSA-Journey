public class pairCube {

    // Pair Cube Count
    public static int paircount(int n) {
        int count = 0;
        for (int a = 1; a <= n; a++) {
            for (int b = 0; b <= n; b++) {
                if (a * a * a + b * b * b == n) {
                    count++;

                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int n = 9;
        System.out.println(paircount(n));
    }

}
