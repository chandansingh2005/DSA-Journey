public class nthTermofAp {
    // find the nth term using for loop
    public static int nthterm(int a1, int a2, int n) {
        int nthterm = a1, d = a2 - a1;
        for (int i = 1; i < n; i++) {
            nthterm += d;

        }
        return nthterm;
    }

    // and find the nth term using AP formula
    public static int usingformula(int a1, int a2, int n) {
        // using formula to find the
        // Nth term t(n) = a(1) + (n-1)*d
        return (a1 + (n - 1) * (a2 - a1));

    }

    public static void main(String args[]) {
        int a1 = 2, a2 = 3, n = 4;
        System.out.println(nthterm(a1, a2, n));
        System.out.println(usingformula(a1, a2, n));

    }

}
