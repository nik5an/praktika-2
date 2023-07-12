package training.day6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<String> getOperators(String s) {
        List<String> operators = new ArrayList<>();
        String[] words = s.split(" ");
        for (String word : words) {
            if (word.contains("+") || word.contains("-") || word.contains("*") || word.contains("/") ||
                    word.contains("plus") || word.contains("minus") || word.contains("multiply")
                    || word.contains("divide")) {
                operators.add(word.replaceAll("\\d", "").trim());
            }
        }
        return operators;
    }
    public static List<Integer> extractInt(String str) {
        List<Integer> numbers = new ArrayList<>();
        String[] words = str.split(" ");
        for (String word : words) {
            word = word.replaceAll("[^0-9]", " ");
            word = word.replaceAll(" +", " ");
            if (word.contains(" ")){
                String[] temp = word.split(" ");
                for (String s:temp) {
                    word = s;
                    if (word.matches("\\d+")) {
                        numbers.add(Integer.parseInt(word));
                    }
                }
            }
            if (word.matches("\\d+")) {
                numbers.add(Integer.parseInt(word));
            }
        }
        return numbers;
    }

    public static int calculate(int a, int b, String operator) {
        int result = a;
        switch (operator) {
            case "+":
            case "plus":
                result += b;
                break;
            case "-":
            case "minus":
                result -= b;
                break;
            case "*":
            case "multiply":
                result *= b;
                break;
            case "/":
            case "divide":
                result /= b;
                break;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your expression(Ex. X + X, X plus X): ");
        String s = scanner.nextLine();
        List<String> operators = getOperators(s);
        List<Integer> nums = extractInt(s);
        int result = nums.get(0);

        if (operators.contains("*")) {
            int i = operators.indexOf("*");
            result = nums.get(i);
            result = calculate(result, nums.get(i + 1), operators.get(i));
            operators.remove(i);
        }

        for (int i = 0; i < operators.size(); i++) {
            result = calculate(result, nums.get(i + 1), operators.get(i));
        }


        System.out.println(result);

        scanner.close();
    }
}
