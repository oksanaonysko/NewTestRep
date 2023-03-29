/*
Создать массив array из 5 имен ("John", "Dan", "Ashe", "Carl", "Bill")
Отсортируйте массив по алфавиту
Добавьте в конец новый елемент массива - "Stan"
Выведите в стобик все елементы массива (каждое имя должно быть с новой строки)
 */

import java.util.Arrays;

public class task10_array2 {

    public static void main(String[] args) {

        String[] arr2 = new String[] {"John", "Dan", "Ashe", "Carl", "Bill", ""};
        arr2[5] = "Stan";
        Arrays.sort(arr2);


        for (int u=0; u<arr2.length; u++){
            System.out.println(arr2[u]);
        }

    }
}
