package training.day3;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String[] temp = s.split(" ");
        System.out.println(temp[0].charAt(0) + ". " + temp[1].charAt(0) + ".");
    }
}
