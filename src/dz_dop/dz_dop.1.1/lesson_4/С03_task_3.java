package dz_dop.lesson_4;

public class С03_task_3 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * 100);
        //int random = 15;
        int fizz = random % 3;
        int buzz = random % 5;
        if (fizz == 0 && buzz == 0) {
            System.out.println(String.format("Число %s являеться FIZZ-BUZZ", random));
        } else if (fizz == 0) {
            System.out.println(String.format("Число %s являеться FIZZ", random));
        } else if (buzz == 0) {
            System.out.println(String.format("Число %s являеться BUZZ", random));
        } else {
            System.out.println(String.format("Число %s не являеться FIZZ-BUZZ", random));
        }
    }
}
