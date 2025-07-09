//print all prime numbers from 2 to n ; n = 10

public class rangePrime {
    public static boolean isPrime1(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(" Prime no 1 to 10 are : ");
        for (int i = 2; i <= 10; i++) {
            if (isPrime1(i)) {
                System.out.print(i + " ");

            }
        }

    }
}
