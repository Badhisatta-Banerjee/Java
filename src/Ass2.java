import java.util.Scanner;

public class Ass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length = sc.nextDouble();
        double width = sc.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;

        System.out.printf("Perimeter = %.2f\n", perimeter);
        System.out.printf("Area = %.2f", area);

        sc.close();
    }
}
