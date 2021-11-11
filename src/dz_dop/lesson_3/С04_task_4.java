package DZ_dop;

import java.util.Scanner;

public class С04_task_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int first_number = input.nextInt();
        System.out.println("Введите второе число: ");
        int second_number = input.nextInt();
        System.out.println("Ответ");
        int result = first_number + second_number;
        System.out.println(result);
    }
}
