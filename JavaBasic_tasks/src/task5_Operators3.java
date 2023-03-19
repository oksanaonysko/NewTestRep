/*
Написать программу в которой пользователь будет вводить число (от 1 до 7)
и выводить соответствующий числу день недели (e.g. 1 - понедельник, 2 - вторник и т.д.)
Если число не в диапазоне от 1 до 7 - вывести текст "Ошибка, введите число от 1 до 7"
Используйте конструкцию if-else-if
 */

import java.util.Scanner;

public class task5_Operators3 {
    public static void main(String[] args) {
        System.out.println("Введите число от 1 до 7");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        if (num == 1) System.out.println("Понедельник");
        else if (num == 2) {
            System.out.println("Вторник");
        }
        else if (num == 3) {
            System.out.println("Среда");
        }
        else if (num == 4) {
            System.out.println("Четверг");
        }
        else if (num == 5) {
            System.out.println("Пятница");
        }
        else if (num == 6) {
            System.out.println("Суббота");
        }
        else if (num == 7) {
            System.out.println("Воскресенье");
        }
        else {
            System.out.println("Ошибка, введите число от 1 до 7");
        }
    }
}
