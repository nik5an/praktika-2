package training.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            words.add(scanner.next());
        }

        words.removeIf(word -> word.length() < 4);

        for (String word : words) {
            System.out.println(word);
        }
        scanner.close();

    }
}
