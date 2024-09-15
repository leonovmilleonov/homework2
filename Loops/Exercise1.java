package Loops;
/*
Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать
количество четных цифр (вторая функция - нечетных).

Например: если введено число 228910, то у него 4 четные цифры (2, 2, 8, 0) и 2 нечетные (9, 1).
 */

import java.util.Scanner;
public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int input = scanner.nextInt();
        System.out.printf("Number of even digits: %d \nNumber of odd digits: %d ",
                findEvenDigits(input),
                findOddDigits(input));
    }
    public static int findEvenDigits(int input){
        int output = 0;
        input = input > 0 ? input : -input;
        while(input > 0){
            if((input % 10) % 2 == 0){
                output++;
            }
            input/=10;
        }
        return output;
    }
    public static int findOddDigits(int input){
        int output = 0;
        input = input > 0 ? input : -input;
        while(input > 0){
            if((input % 10) % 2 != 0){
                output++;
            }
            input/=10;
        }
        return output;
    }
}
