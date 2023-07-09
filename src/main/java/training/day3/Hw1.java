package training.day3;

import java.util.Scanner;

public class Hw1 {

    static int min(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println(min(arr));

        scanner.close();
    }
}
