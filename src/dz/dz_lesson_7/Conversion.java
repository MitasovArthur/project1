package dz.dz_lesson_7;

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму которую хотети конвентировать: ");
        int first_currency=sc.nextInt();
        System.out.println("Введите курс для конвертации в другую валюту: ");
        int other_currency=sc.nextInt();
        System.out.println(well(first_currency,other_currency));


    }

    public static  float well(float first_argumet, float second_argument){
        return first_argumet*second_argument;
    }
}
