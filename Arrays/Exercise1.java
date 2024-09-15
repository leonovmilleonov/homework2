package Arrays;
/*
Дан одномерный массив целых чисел.
Написать функцию, удаляющую из него все отрицательные элементы
(удалить - значит создать новый массив с только положительными элементами).
После удаления - умножить каждый элемент массива на его длину.
Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]

Не забывать, что всю логику приложения нужно выносить в отдельные функции.
main - только для тестирования написанного функционала.
 */

import java.util.Arrays;

public class Exercise1 {
    public static void main(String[] args) {
        int[] array = {3, 5, -6, 3, 2, -9, 0, -123};
        System.out.println(Arrays.toString(removeNegativeAndMultiply(array)));
    }

    public static int[] removeNegativeAndMultiply(int[] array) {
        int[] result = removeNegative(array);
        multiplyArray(result);
        return result;
    }

    public static int[] removeNegative(int[] array) {
        int[] positiveArray = new int[amountOfPositiveNumbers(array)];
        int index = 0;
        for (int j : array) {
            if (j >= 0) {
                positiveArray[index++] = j;
            }
        }
        return positiveArray;
    }

    public static void multiplyArray(int[] array) {
        int factor = array.length;
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * factor;
        }
    }

    public static int amountOfPositiveNumbers(int[] array) {
        int amount = 0;
        for (int i : array) {
            if (i >= 0) {
                amount++;
            }
        }
        return amount;
    }
}
