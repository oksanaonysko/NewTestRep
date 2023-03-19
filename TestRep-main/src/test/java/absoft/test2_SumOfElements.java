package absoft;

/*
Напишите программу которая попросит пользователя ввести price и qty (перед вводом значений должен быть текст что именно нужно ввести)

Выведите в консоль "Total:" и результат который равен price * qty.
P.S. Price может быть как целым так и дробным числом. (e.g. 20,99)
 */

import java.util.Scanner;

public class test2_SumOfElements {

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please provide the price for your item:");
        double price = input.nextDouble();
        System.out.println("And how many of those would you like?");
        int qty = input.nextInt();

        System.out.println("Total: " + price * qty);
    }
}