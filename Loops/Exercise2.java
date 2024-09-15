package Loops;
/*
Дано целое число.
Написать функцию, которая принимает целое число, а возвращает целое число обратное этому
(не строку!).
Результат вывести на консоль.
Например: 4508 -> 8054, 4700 -> 74, 1234567 -> 7654321
Примечание: для решения может понадобится функция возведение числа в
степень: Math.pow(число, степень)
 */


import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        System.out.print("Enter your number: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.printf("Reverse number: %d", findReverseNumber(input));
    }
    public static int findReverseNumber(int input){
        int result = 0;
        while(input > 0){
            result = result * 10 + input % 10;
            input /= 10;
        }
        return result;
    }
}
