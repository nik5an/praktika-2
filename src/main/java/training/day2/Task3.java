package training.day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.charAt(i));
        }

        System.out.println("-----");

        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.println(s.charAt(i));
        }

        scanner.close();
    }
}
