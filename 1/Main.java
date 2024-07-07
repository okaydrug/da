/*
Вариант А
1. Приветствовать любого пользователя при вводе его имени через командную строку.
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("Привет, "+ name + "!");
        scanner.close();
    }
}
