
// Square hollow pattern
import java.util.*;

public class squareHollow {

    public static void printPattern(int n) {
        int i, j;

        for (i = 0; i < n; i++) {

            for (j = 0; j < n; j++) {

                if (i == 0 || j == 0 || i == n - 1
                        || j == n - 1) {
                    System.out.print("*");
                }

                // otherwise print space only
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // Driver Function
    public static void main(String args[]) {
        int n = 6;
        printPattern(n);
    }
}