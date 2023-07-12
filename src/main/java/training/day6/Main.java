package training.day6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static String removeDigits(String s) {
        return s.replaceAll("\\d", "");
    }

    static String extractInt(String str) {
        str = str.replaceAll("[^0-9]", " ");
        str = str.replaceAll(" +", " ");

        if (str.equals(""))
            return "-1";

        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your expression(Ex. X + X, X plus X): ");
        String s = scanner.nextLine();
        String operator = removeDigits(s);
        String[] temp = extractInt(s).split(" ");
        int[] digits = new int[temp.length];
        for (int i = 0; i < digits.length; i++) {
            digits[i] = Integer.parseInt(temp[i]);
        }

        switch (operator.toLowerCase().trim()) {
            case "+":
            case "plus":
                System.out.println(digits[0] + digits[1]);
                break;
            case "-":
            case "minus":
                System.out.println(digits[0] - digits[1]);
                break;
            case "*":
            case "multiply":
                System.out.println(digits[0] * digits[1]);
                break;
            case "/":
            case "divide":
                System.out.println(digits[0] / digits[1]);
                break;
        }

        scanner.close();
    }
}
