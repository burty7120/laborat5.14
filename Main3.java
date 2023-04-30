
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть три дробові числа:");
        double num1, num2, num3;
        if (sc.hasNextDouble()) {
            num1 = sc.nextDouble();
        } else {
            System.out.println("Помилка: введене значення не є дробовим числом.");
            return;
        }
        if (sc.hasNextDouble()) {
            num2 = sc.nextDouble();
        } else {
            System.out.println("Помилка: введене значення не є дробовим числом.");
            return;
        }
        if (sc.hasNextDouble()) {
            num3 = sc.nextDouble();
        } else {
            System.out.println("Помилка: введене значення не є дробовим числом.");
            return;
        }
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + " є найбільшим з введених чисел.");
        } else if (num2 > num3) {
            System.out.println(num2 + " є найбільшим з введених чисел.");
        } else {
            System.out.println(num3 + " є найбільшим з введених чисел.");
        }
    }
}