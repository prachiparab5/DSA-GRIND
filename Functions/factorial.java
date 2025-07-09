public class factorial {

    public static int fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        int num = 5;
        int result = fact(num);
        System.out.println("factorial of " + num + " is:" + result);

    }
}
