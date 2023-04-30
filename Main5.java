import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перший рядок: ");
        String str1 = scanner.nextLine();

        System.out.print("Введіть другий рядок: ");
        String str2 = scanner.nextLine();

        if (str1.length() > str2.length()) {
            System.out.println("Перший рядок є більшим за кількістю символів.");
        } else if (str2.length() > str1.length()) {
            System.out.println("Другий рядок є більшим за кількістю символів.");
        } else {
            System.out.println("Рядки мають однакову довжину.");
        }
    }
}
