package Practice.lesson_4;

import java.util.Scanner;

public class С02_My_task_case_break {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("a=");
        int a = input.nextInt();
        System.out.println("b=");
        int b = input.nextInt();
        switch (a) {
            case 30:
                double y = 12 * a + (b - a) * Math.cos(a - 1);
                System.out.println(y);
                break;
            case 15:
                double z = 3 * (a * a) + (b + 2) * Math.cos(a - 1);
                System.out.println(z);
                break;
            case 5:
                double s = (b + 2) * Math.cos(2 * a + 1);
                System.out.println(s);
                break;
            default:
                double x = a + 7 * b;
                System.out.println(x);


        }
    }
}
