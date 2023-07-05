package training.day3;

public class Task2 {
    static void jackgrealish(String str1, String str2) {
        if (str1.contains(str2)) {
            str1 = str1.substring(0, str1.indexOf(str2.charAt(0)));
        }
        System.out.println(str1);
    }

    public static void main(String[] args) {
         String a = "Plovdiv";
         String b = "div";
         jackgrealish(a, b);

    }
}
