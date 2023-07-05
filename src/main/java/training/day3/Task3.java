package training.day3;


public class Task3 {
    public static void main(String[] args) {
        String s = "I love Java";
        String[] temp = s.split(" ");
        s = "";

        for (int i = temp.length - 1; i >= 0; i--) {
           s= s.concat(temp[i] + " ");
        }

        System.out.println(s);
    }
}
