package Ass13;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return add(add(a,b),c);
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int a=5,b=10;
        int result1 = calc.add(a,b);
        System.out.printf("Test Case 1: (%d + %d) = %d\n",a,b,result1);

        int x=1,y=2,z=3;
        int result2 = calc.add(x,y,z);
        System.out.printf("Test Case 2: (%d + %d + %d) = %d\n",x,y,z,result2);

        double m=5.5,n=2.5;
        double result3 = calc.add(m,n);
        System.out.printf("Test Case 3: (%.1f + %.1f) = %.1f\n",m,n,result3);
    }
}
