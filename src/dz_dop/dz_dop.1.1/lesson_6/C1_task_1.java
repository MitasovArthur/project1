package dz_dop.lesson_6;

public class C1_task_1 {
    public static void main(String[] args) {

        for (int i = 0; i < 11; i++) {
            System.out.println(i);
        }
        for (int i = 10; i > -1; i--) {
            System.out.println(i);
        }
        for (int i = 0; i < 11; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = 10; i > -1; i--) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}