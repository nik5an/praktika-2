package training.day3;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 4; i++) {
            words.add(scanner.next());
        }

        String temp = words.get(0);
        words.set(0, words.get(words.size() - 1));
        words.set(words.size() -1, temp);

        for (int i = 0; i < 4; i++) {
            System.out.println(words.get(i));
        }
    }
}
