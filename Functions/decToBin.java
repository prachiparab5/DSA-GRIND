public class decToBin {

    public static void decToBin1(int n) {
        int myNum = n;
        String binStr = "";

        while (n > 0) {
            int rem = n % 2;
            binStr = rem + binStr;
            n = n / 2;
        }

        System.out.println("Binary of " + myNum + " = " + binStr);
    }

    public static void main(String[] args) {
        decToBin1(13);
    }
}
