package absoft;
/*
Написать программу которая будет выводить цифры от 1 до 10 используя цикл while
Когда цифра будет равна 2 или 6 или 10 - вывести сообщение ("[число] - some cool text")
 */

public class test7_while {
    public static void main(String[] args) {
        int num = 0;
        while (num < 10) {
            ++num;
            if (num == 2 || num == 6 || num == 10){
                System.out.println(num + " - Allons-y, Alonso");
                continue;
            }

            System.out.println(num);

        }
    }

}
