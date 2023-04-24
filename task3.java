// Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
package homework.homework_java_2;

import java.util.Arrays;

public class task3 {
    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, -5, 10, 10, 10, -1};  // 1, 2, 3, 15, 10, 10, 10, 15
        swapNegative(array);
        System.out.println(Arrays.toString(array));

    }
    public static void swapNegative(int[] array) {
        int sumIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] >= 10) && (array[i] <= 99)) sumIndex += i;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) array[i] = sumIndex;
        }
    }
}
