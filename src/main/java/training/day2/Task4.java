package training.day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();

        if (s >= 50 && s <= 70) {
            System.out.println("skinny");
        } else if (s >= 71 && s <= 90) {
            System.out.println("skinny fat");
        } else if (s >= 91 && s <= 110) {
            System.out.println("obese");
        } else if (s > 110) {
            System.out.println("extra obese");
        } else {
            System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
