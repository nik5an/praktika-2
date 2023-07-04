package training.day2;

public class Hw1 {
    public static void main(String[] args) {
        String[] words = {"Алфа", "Аватар", "Беда", "Бреза", "Салон"};

        for (String word : words) {

            if (word.charAt(0) == 'А'){
                System.out.println(word);
            }
        }
    }

}
