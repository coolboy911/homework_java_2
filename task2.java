// Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
package homework.homework_java_2;

public class task2 {
    public static void main(String[] args) {
        int[] n = new int[] {1, 2, 3, 4};
        System.out.println("Array is increasing: " + isIncreasing(n));
    }
    public static boolean isIncreasing(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i+1]) return false;
        }
        return true;
    }
}

