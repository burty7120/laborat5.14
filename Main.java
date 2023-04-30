import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введіть п'ять окремих слів:");
        String word1 = sc.next();
        String word2 = sc.next();
        String word3 = sc.next();
        String word4 = sc.next();
        String word5 = sc.next();
        String sentence = word1.concat(" ").concat(word2).concat(" ").concat(word3).concat(" ").concat(word4).concat(" ").concat(word5);
        System.out.println("Результат: " + sentence);
    }
}



