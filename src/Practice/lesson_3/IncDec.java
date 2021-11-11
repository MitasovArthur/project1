package Prectik_2;

public class IncDec {
    public static void main(String[] args) {
        // Операторы инкремент
        // 1) Постфиксный инкремент
        byte number1 = 0;
        System.out.println(number1++); // Сначала выводит на экран а потом увеличиваем на 1
        System.out.println(number1);

        // 2)Префексный инкримент
        byte number2 = 0;
        System.out.println(++number2); // Добавляем единицу и выводим

        // Оператор Дикримент
        // 1) Постфиксный дикримент
        byte number3 = 3;
        System.out.println(number3--);
        System.out.println(number3);

        // 2) Префексный Дикримент
        byte number4 = 3;
        System.out.println(--number4);

        int i = 0;
        int y = 1;
        i = i + 1; i += 1;
        i = i + 5; i += 5;
        i += y * 5; // мы можем присваивать другие значения и делать с ними манипуляции





    }
}
