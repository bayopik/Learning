package Collections.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *** Напишите программу на java,
 * которая будет принимать список чисел
 * и выводить на экран только те числа,
 * которые делятся на 3 без остатка.
 */

public class GettingNumber {
    public static void main(String[] args) {
        boolean havingText = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа через запятую: ");
        String input = sc.nextLine();
        String[] numbers = input.split(",");
        ArrayList<String> list = new ArrayList<>();
        for (String numberConcrete : numbers) {
            try {
                int number = Integer.parseInt(numberConcrete.trim());
                if (number % 3 == 0 && number != 0) {
                    list.add(String.valueOf(number));
                }
            } catch (NumberFormatException e) {
                havingText = true;
            }
        }
        if (havingText) {
            System.out.println("Пожалуйста, введите только числа. Программа не предназначена для текста.");
        } else {
            if (!list.isEmpty()) {
                System.out.println("Числа, делящиеся на \"3\": " +  String.join(", ", list));
            } else {
                System.out.println("Среди введенных чисел нет ни одного, которое бы делилось на \"3\"");
            }
        }
    }
}
