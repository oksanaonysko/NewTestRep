/*
Создать массив array из 10 целых чисел
C помощью цикла записать в массив числа от 1 до 10
Вывести в консоль все записанные в него числа в следующем виде - [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */

public class task9_array {

    public static void main(String[] args) {

        int[] arr1 = new int[10];

        for (int a=0; a< arr1.length; a++ ) {
            arr1[a] = a+1;
            System.out.print(arr1[a]);
        }



    }


}
