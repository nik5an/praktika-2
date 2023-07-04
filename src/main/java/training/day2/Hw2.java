package training.day2;

public class Hw2 {

    static int sum(int[] arr){
        int sum = 0;

        for (int num:arr) {
            sum += num;
        }

        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 6 ,2 ,1};

        System.out.println(sum(arr));
    }
}
