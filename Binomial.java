public class Binomial {
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int Binomial(int n, int r) {
        int fact_a = factorial(n);
        int fact_b = factorial(r);
        int fact_c = factorial(n - r);
        int binomial = fact_a / fact_b * fact_c;
        return binomial;
    }
    public static void main(String args[]){
        System.out.println(Binomial(3, 2));
    }
    
}
