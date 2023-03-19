package absoft;
/*
Написать программу в которой пользователь должен ввести целое число (n) в диапазоне от 1 до 20
Вывести в консоль ТОЛЬКО числа от 1 до n (включительно)
Если введенное пользователем число (n) меньше 1 или больше 20 - вывести текст "Ошибка, введите число от 1 до 20"
 */

import java.util.Scanner;

public class test8_for_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число от 1 до 20:");
        int n = input.nextInt();

            if (n<=0){System.out.println("Ошибка, введите число от 1 до 20");}
            else {
                for (int a = 1; a <= n; ++a) {

                    if (n > 20) {
                        System.out.println("Ошибка, введите число от 1 до 20");
                        break;
                    }

                    System.out.println(a);
                }
            }

    }

}
