package HW_1;

public class HW_1 {
    public static void main(String[] args) {

        byte a = 121;
        short b = 255;
        int c = 12323;
        long d = 12341232;

        float e = 12.5f;
        double f = 132.333;

        char g = 'A';

        boolean h = true;

        operation(2, 10, 15, 3);

        summCompare(10, 5);

        positiveOrNegative(-934857);

        System.out.println(number(-1));

        hello("Alex");

        year(800);
    }

    public static void operation(float a, float b, float c, float d) {
        System.out.println(a * (b + (c / d)));
    }

    public static void summCompare(int a, int b) {
        int c = a + b;
        if (c >= 10 && c <= 20) {
            System.out.println("сумма чисел = " + c + " условие выполнено!");
        } else {
            System.out.println("сумма чисел (" + c + ") не удовлетворяет условиям!");
        }
    }

    public static void positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Число " + a + " является положительным.");
        } else {
            System.out.println("Число " + a + " является отрицательным.");
        }
    }

    public static boolean number(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void hello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void year(int a) {
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0) {
            System.out.println("Год " + a + " високосный.");
        } else {
            System.out.println("Год " + a + " не високосный.");
        }
    }
}
