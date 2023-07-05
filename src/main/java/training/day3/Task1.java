package training.day3;

public class Task1 {
    static void positive(int[] arr){
        System.out.println("Positive:");
        for (int num : arr) {
            if (num > 0) {
                System.out.print(num + " ");
            }
        }
    }
    static void negative(int[] arr){
        System.out.println("\nNegative:");
        for (int num : arr) {
            if (num < 0) {
                System.out.print(num + " ");
            }
        }
    }
    static void odd(int[] arr){
        System.out.println("\nOdd:");
        for (int num: arr) {
            if (num % 2 != 0) {
                System.out.print(num+" ");
            }
        }
    }

    static void even(int[] arr){
        System.out.println("\nЕven:");
        for (int num: arr) {
            if (num % 2 == 0) {
                System.out.print(num+" ");
            }
        }
    }
    static int petici(int[] arr){
        int count = 0;
        for (int num: arr) {
            if (num == 5){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        int[] arr = {10, 2, -1, 1, 5, 9, 7, 6, 5, -5};

        positive(arr);
        negative(arr);
        odd(arr);
        even(arr);
        System.out.println("\nPetici: " + petici(arr));
    }
}
