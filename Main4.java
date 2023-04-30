
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше ім'я: ");
        String firstName = scanner.nextLine();

        System.out.print("Введіть друге ім'я: ");
        String secondName = scanner.nextLine();

        if (firstName.equals(secondName)) {
            System.out.println("Імена ідентичні.");
        } else {
            System.out.println("Імена не ідентичні.");
        }
    }
}
