package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *** Напишите программу, которая будет принимать список слов
 * и выводить на экран только те слова, которые начинаются с буквы "а".
 */
public class GettingWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова через запятую: ");
        String input = scanner.nextLine();
        String[] words = input.split(",");
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
            if (word.trim().toLowerCase().startsWith("a") || word.trim().toLowerCase().startsWith("а")) {
                list.add(word.trim());
            }
        }
        System.out.println("Слова, начинающиеся с буквы \"a\": " + String.join(", ", list));
    }
}
