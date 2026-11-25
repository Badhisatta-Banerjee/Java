import java.util.Scanner;

public class Ass4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("The Quotient is = " + quotient);
        System.out.println("The Remainder is = " + remainder);

        sc.close();
    }
}
