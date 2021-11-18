package dz.dz_lesson_4;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = input.nextInt();
        String result;
        if (a < 0) {
            System.out.println("Число не входит в диапазон" + " \n " + "Введите число в диапазоне 0-100 ");
        } else if (a > 100) {
            System.out.println("Число не входит в диапазон" + " \n " + "Введите число в диапазоне 0-100 ");
        } else {
            result = (a < 35) ? (a < 15 ? "0-14 " : " 15-35") : (a < 50 ? "35-50" : "50-100");
            System.out.println("Ваш диапазон: " + result);
        }


    }
}
