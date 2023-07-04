package training.day2;
import java.util.Scanner;

//Nikolay
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name, pwd;


        while (true){
            System.out.println("Enter username: ");
            name = scanner.next();
            System.out.println("Enter password: ");
            pwd = scanner.next();

            if (name.equals("Ivan") && pwd.equals("1234")){
                break;
            }

            System.out.println("Wrong credentials!");
        }

        System.out.println("Welcome, " + name + "!");
        scanner.close();
    }
}