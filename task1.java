// Дана последовательность N целых чисел. Найти сумму простых чисел.
package homework.homework_java_2;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("enter number of numbers: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int[] array = RandomArray(-100, 100, n);
        System.out.println(Arrays.toString(array));
        System.out.println("sum of primes is: " + sumOfPrimes(array));
    }

    public static int RandomNum(int min, int max) {
        int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
        return randomNum;
    }

    public static int[] RandomArray(int min, int max, int lenght) {
        int[] array = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            array[i] = RandomNum(min, max);
        }
        return array;
    }

    public static int sumOfPrimes(int[] array) {
        int sum = 0;

        for (int el : array) {
            int i = 2;
            boolean flag = true;
            int num = el;
            if (el < 0) num = -el;
            if (num > 1) {
                while (i < (int)Math.sqrt(num) + 1 && flag) {
                    if (num % i == 0) flag = false;
                    i++;
                }
            }
            if (flag) sum += el;
        }
        return sum;
    }
}