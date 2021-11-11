package Practice.lesson_4;

import java.util.Scanner;

public class С01_My_task_else_if {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double a = input.nextDouble();
        System.out.println("b=");
        int b = input.nextInt();

        if (a == 30) {
            double y = 12 * a + (b - a) * Math.cos(a - 1);
            System.out.println("y=" + y);
        } else if (a == 15) {
            double y = 3 * (a * a) + (b + 2) * Math.cos(a - 1);
            System.out.println("y=" + y);
        } else if (a == 5) {
            double y = (b + 2) * Math.cos(2 * a + 1);
            System.out.println("y=" + y);
        } else {
            double y = a + 7 * b;
            System.out.println("y=" + y);
        }

    }
}
