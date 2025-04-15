import java.util.Scanner;

public class swapTwoNumber {
    // Swap two number simple approach
    public static void swap(int a, int b) {
        int temp = b;
        b = a;
        a = temp;
        System.out.println(a +" ,"+b);

    }


    public static void main(String args[]) {
        int a = 2, b = 3;
        swap(a, b);
    }

}
