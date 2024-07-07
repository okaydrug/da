/*
Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке
*/
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        System.out.print("Число с цифрами в обратном порядке: ");
        while (number >  0) {
            stack.push(number % 10);
            number = number / 10;
            System.out.print(stack.pop());

        }

        }
    }
