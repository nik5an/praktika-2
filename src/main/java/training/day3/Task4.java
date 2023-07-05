package training.day3;
import java.util.Scanner;

public class Task4 {
    static void initials(String s){
        String[] temp = s.split(" ");
        System.out.println(temp[0].charAt(0) + ". " + temp[1].charAt(0) + ".");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        initials(s);
    }
}
