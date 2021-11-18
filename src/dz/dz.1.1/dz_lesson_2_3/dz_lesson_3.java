package dz;

public class dz_lesson_3
{
    public static void main(String [] args){
        //Задание 1
    int x = 10;
    int y = 12;
    int z = 3;
    int result_1 = x += y - x++ * z;
    int result_2 = z = --x - y * 5;
    int result_3 = y /= x + 5 % z;
    int result_4 = z = x++ + y * 5;
    int result_5 = y - x++ * z;
    System.out.println(result_1);
    System.out.println(result_2);
    System.out.println(result_3);
    System.out.println(result_4);
    System.out.println(result_5);
        //Задание 2
        short first_number = 19;
        short second_number = 21;
        short third_number = 6;
        float mean = (first_number + second_number + third_number) / 3f;
        System.out.println(mean);
        //Задание 3
        final double PI = 3.14159265359F;
        double r = 5f;
        double result = PI * Math.sqrt(r);
        System.out.println(result);
        //Задание 4
        double R = 3.5;
        double H = 5;
        double V = PI * Math.sqrt(R) * H;
        double S = 2 * PI * Math.sqrt(R) + PI * Math.sqrt(R); //вариант 1
        double s = 2 * PI * R * (R + H);// вариант 2
        System.out.println(S);
        System.out.println(s);




    }
}
