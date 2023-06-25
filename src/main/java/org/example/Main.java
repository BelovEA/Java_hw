package org.example;



import java.util.ArrayList;
import java.util.Random;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(1000);
            numbers.add(randomNumber);
        }

        numbers.removeIf(number -> number % 2 == 0);

        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }

        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.size();

        System.out.println("Список после удаления четных чисел: " + numbers);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);
    }
}
