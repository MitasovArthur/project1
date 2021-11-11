package Prectik_2;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Сканер позволяет обрабатывать ввод данных с консоли
        System.out.println("Vvedite celoe chislo: ");
        int a = input.nextInt(); //Считывает челое число

        System.out.println("Vvedite celoe chislo: ");
        float b = input.nextFloat();  //Считывает дробное число

        System.out.println("Vvedite stroky s probelom");
        String c = input.next(); // Считывает до пробела
        input = new Scanner(System.in);
        System.out.println("Vvedite stroky s probelom");
        String d = input.nextLine();//Считывает строку
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
    }
}
