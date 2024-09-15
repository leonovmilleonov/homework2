package Loops;
/*
Программист Ваня сразу после окончания курсов dmdev устроился в IT компанию на позицию Junior
Java Developer с зарплатой 600$ в месяц.
Ему обещали, что будут поднимать зарплату на 400$ каждые 6 месяцев.
300$ в месяц Ваня тратит на еду и развлечения.
10% от зарплаты Ваня ежемесячно переводит на счет брокера, чтобы инвестировать в акции с доходностью 2% в месяц.

Посчитать, сколько Ваня будет иметь средств на своем счету и на счету брокера за 3 года и 2 месяца.

Для интереса: попробовать увеличить процент, которые Ваня инвестирует из своей зарплаты
 */

import java.util.Scanner;

public class Exercise3 {
    public static final int EXPENSES = 300;
    public static final int SALARY_INCREASE = 400;
    public static int CURRENT_SALARY = 600;
    public static double SAVED_MONEY = 0;
    public static double INVESTMENTS = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the percentage for monthly investment: ");
        double percentage = scanner.nextDouble();
        findAllMoney(percentage);
        System.out.printf("Saved money: %f \nInvested money: %f", SAVED_MONEY, INVESTMENTS );
    }
    public static void findAllMoney(double percentage){
        for(int i = 1; i <= 38; i++){
            SAVED_MONEY = SAVED_MONEY + CURRENT_SALARY - EXPENSES - CURRENT_SALARY*percentage/100;
            INVESTMENTS = INVESTMENTS * 1.02 + CURRENT_SALARY*percentage/100;
            if(i % 6 == 0){
                CURRENT_SALARY += SALARY_INCREASE;
            }
        }
    }
}
