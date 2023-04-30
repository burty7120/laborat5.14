 import java.util.Scanner;

    public class Main2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введіть п'ять слів:");
            String word1 = sc.next();
            String word2 = sc.next();
            String word3 = sc.next();
            String word4 = sc.next();
            String word5 = sc.next();
            System.out.println("Перші літери слів: " + word1.substring(0, 1) + word2.substring(0, 1) + word3.substring(0, 1) + word4.substring(0, 1) + word5.substring(0, 1));
        }
    }

