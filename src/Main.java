import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку \"I Like Java!!!\":");
        String str1 = scanner.nextLine();
        System.out.println(str1);

        boolean result1 = str1.contains("Java");
        boolean result2 = str1.startsWith("I like");
        boolean result3 = str1.endsWith("!!!");

        if (result1==result2==result3==true) {
            System.out.println(str1.toUpperCase());
        }

        str1 = str1.replace("a","o");
        System.out.println(str1.substring(7,11));
    }
}