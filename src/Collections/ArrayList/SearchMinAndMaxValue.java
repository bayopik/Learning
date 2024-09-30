package Collections.ArrayList;

/*
 *** Напишите программу на java, которая будет находить
 *  максимальное и минимальное значение в списке чисел.
 */

import java.util.Scanner;

public class SearchMinAndMaxValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите числа через запятую: ");
        String input = sc.nextLine();
        String[] numbers = input.split(",");
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        boolean havingText = false;
        for (String numberConcrete : numbers) {
            try {
                String number = numberConcrete.trim();
                if (Integer.parseInt(number) <= min) {
                    min = Integer.valueOf(number);
                }
                if (Integer.parseInt(number) >= max) {
                    max = Integer.valueOf(number);
                }
            } catch (NumberFormatException e) {
                havingText = true;
            }
        }
        if (havingText) {
            System.out.println("Пожалуйста, введите только числа. Программа не предназначена для текста.");
        }
        if (min != Integer.MAX_VALUE && max != Integer.MIN_VALUE) {
            System.out.println("Максимальное значение в списке чисел: " + max + " \nМинимальное значение в списке чисел: " + min);
        }
    }
}

