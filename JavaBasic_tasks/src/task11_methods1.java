/*
Написать метод, который будет возвращать total (total = price * qty * 0.8)
Price может быть как целым числом так и дробным
Метод должен принимать значения price и qty (значения можете задать самостоятельно)
Вывести в консоль "Your total = " + результат
 */

import java.util.Scanner;

public class task11_methods1 {
    static void result(double price, int qty){
        double total = price*qty*0.8;
        System.out.println("Your total = "+ total);
        }
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Please provide price of the item:");
        double price = input.nextDouble();
        System.out.println("Please provide quantity:");
        int qty = input.nextInt();

        result(price, qty);

    }
}
