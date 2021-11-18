package dz.dz_lesson_6;


import java.util.Scanner;

public class SumMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите два числа");
        int A = sc.nextInt(), B = sc.nextInt();
        int sum = 0;
        if (A >= B) {

            // Создаем цикл со счетчиком for
            for (int i = A; i < B; i++) {
                sum += i; //  Считаем сумму всех чисел, расположенных между числами A и B
            }
            System.out.println("Сумма чисел в интервале [" + A + " , " + B + "]: " + sum);

            System.out.print("Нечетные числа в интервале [" + A + " , " + B + "]: ");
            for (int i = A; i < B; i++) {
                // В блоке if находим все нечетные значения
                if (!((i % 2) == 0)) {
                    System.out.print(i + " ");
                }
            }
        } else {
            System.out.println("Первое число должно быть больше второго");
        }
    }
}


