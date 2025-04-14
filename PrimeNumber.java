public class PrimeNumber {
    public static void checkPrimeNumber(int n){
        // 1 and 2 is already prime number
        if (n==1 || n==2) {
            System.out.println("This is prime number");
            
        }else{
            boolean isPrime=true;
            for(int i=2;i<Math.sqrt(n);i++){
                if (n%i==0) {
                    isPrime=false;
                    
                }
            }
            if (isPrime==true) {
                System.out.println("n is prime number");
                
            }else{
                System.out.println(" n is not a prime number");
            }
        }
    }

    public static void main(String args[]) {
        System.out.println("this is practise class ");
       checkPrimeNumber(10);
    }
    
}
