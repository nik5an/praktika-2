package training.day3;

import java.util.Scanner;

public class Hw2 {

    static boolean mariogotze(int num) {
        if (num % 2 == 0) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.println(mariogotze(num));
    }
}
