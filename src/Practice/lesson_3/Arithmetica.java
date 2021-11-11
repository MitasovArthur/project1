package Prectik_2;

public class Arithmetica {
    public static void main(String [] args){

        //арифметические операторы +,-,*,/,%

        //Addition (+)
        byte summand1 = 1, summand2 = 2;// множественное объявление. НЕ РЕКОМЕНДУЕТЬСЯ( не читабельно)
        int sum = 0;
        sum = summand1 + summand2;
        System.out.println(sum);
        //Subtraction (-)
        byte minuend = 5, subtraction = 3;
        int difference = 0;
        difference = minuend - subtraction;
        System.out.println(difference);

        //Multiplication (*)
        byte factor1 = 2, factor2 = 3;
        int product = 0;
        product = factor1 * factor2;
        System.out.println(product);

        //Division (/)
        byte dividend = 5, divisor = 2;
        int quotient = 0, remainder = 0;
        quotient = dividend / dividend;
        System.out.println(quotient);

        //remainder (%)
        remainder = dividend % divisor;
        System.out.println(remainder);
    }
}
