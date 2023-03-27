/*
Написать 2 метода:
- Первый метод должен принимать как параметр имя пользователя (одно из трех - "Alex", "John", "Stan") и
выводить в консоль текст "Hello [имя]"
- Второй метод должен принимать как параметр имя, которое было введено в первом методе и выводить в
консоль номер места (1, 2 или 3) с соответствующим текстом ("Your seat is [номер места]")
Если имя не "Alex", "John" или "Stan" - вывести в консоль "Sorry, name was not found"
 */

import java.util.Scanner;

public class task12_methods2 {
    static void method1 (String name){
        System.out.println("Hello, "+ name + "!");
    }
    static String method2 (String name) {
        switch (name) {
            case "Alex":
                System.out.println("Your seat is 1");
            case "John":
                System.out.println("Your seat is 2");
                break;
            case "Stan":
                System.out.println("Your seat is 3");
                break;
            default:
                System.out.println("Sorry, the seat was not found for " + name);
        }
        return name;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please provide your name:");
        String name = sc.nextLine();

                method1(name);
                method2(name);

    }

    }
