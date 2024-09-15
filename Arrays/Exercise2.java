package Arrays;

import java.util.Arrays;

/*
Дан одномерный массив символов.
Преобразовать его в одномерный массив чисел, где число - это код символа
(любой символ - это число в памяти компьютера).
Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]

Далее определить среднее арифметическое всех элементов целочисленного массива
и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */
public class Exercise2 {
    public static void main(String[] args) {
        char[] array = {'a', '6', 'y', 'P', 'T', 'q', '9', '+'};
        printLessThanArithmeticMean(array);
    }

    public static void printLessThanArithmeticMean(char[] array) {
        int[] intArray = convertCharToInt(array);
        double arithmeticMean = findArithmeticMean(intArray);

        for (int j : intArray) {
            if (j > arithmeticMean) {
                System.out.print(j + " ");
            }
        }
    }

    public static double findArithmeticMean(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    public static int[] convertCharToInt(char[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
