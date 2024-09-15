package Arrays;
/*
Дан одномерный массив целых чисел.

Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными
числами, только положительными и только нули.
Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
Возвращает функция эти три массива в виде одного двумерного.

 */

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        int[] array = {-4, 0, 1, 9, 0, -18, 3};
        int[][] result = splitIntoArrays(array);
        System.out.println(Arrays.toString(result[0]));
        System.out.println(Arrays.toString(result[1]));
        System.out.println(Arrays.toString(result[2]));
    }

    public static int[][] splitIntoArrays(int[] array) {
        int [][] result = new int[3][];
        result[0] = findNegativeNumbers(array);
        result[1] = findPositiveNumbers(array);
        result[2] = findZero(array);
        return result;
    }
    public static int[] findNegativeNumbers(int [] array){
        int size = 0;
        for (int i : array) {
            if(i < 0){
                size++;
            }
        }
        int[] result = new int[size];
        int index = 0;
        for (int j : array) {
            if (j < 0) {
                result[index++] = j;
            }
        }
        return result;
    }
    public static int[] findPositiveNumbers(int [] array){
        int size = 0;
        for (int i : array) {
            if(i > 0){
                size++;
            }
        }
        int[] result = new int[size];
        int index = 0;
        for (int j : array) {
            if (j > 0) {
                result[index++] = j;
            }
        }
        return result;
    }
    public static int[] findZero(int [] array){
        int size = 0;
        for (int i : array) {
            if(i == 0){
                size++;
            }
        }
        int[] result = new int[size];
        int index = 0;
        for (int j : array) {
            if (j == 0) {
                result[index++] = j;
            }
        }
        return result;
    }
}
