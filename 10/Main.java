/*
В каждой строке найти слова, начинающиеся с гласной буквы.
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        System.out.println("Слова, начинающиеся с гласной буквы:");
        for (String word : words) {
            char firstLetter = Character.toLowerCase(word.charAt(0));
            if (firstLetter == 'а' || firstLetter == 'е' || firstLetter == 'ё' ||
                    firstLetter == 'и' || firstLetter == 'о' || firstLetter == 'у' ||
                    firstLetter == 'ы' || firstLetter == 'э' || firstLetter == 'ю' ||
                    firstLetter == 'я') {
                System.out.println(word);
            }
        }
    }
}
