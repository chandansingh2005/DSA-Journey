import java.util.*;

public class checktriangle {
    // check valid triangle
    public static boolean validtriangle(int a, int b, int c) {
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            return true;

        } else {
            return false;
        }

    }

    public static void main(String args[]) {
        // int a = 7, b = 10, c = 5;
        int a = 1, b = 10, c = 12;
        System.out.println(validtriangle(a, b, c));
    }

}
