package absoft;
// import java.util.Scanner;

/*
Напишите программу в которой пользователь должен ввести с клавиатуры name и age

Выведите на экран 2 строки:
Hello (name)
Your age is (age)
 */

import java.util.Scanner;

public class test1_simplePrint {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = input.nextLine();
        System.out.println("How old are you?");
        int age = input.nextInt();

        System.out.println("Hello "+name + "! Nice to meet you!");
        System.out.println("Your age is " + age);
    }
}


