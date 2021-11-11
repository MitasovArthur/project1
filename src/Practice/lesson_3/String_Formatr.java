package Prectik_2;

public class String_Formatr {
    public static void main(String[] args) {
       int a = 1, b = 2, c = 3;

       //Конкатенация строки
        System.out.println("Это число " + a);

        //форматирование строки с помощью метода format класса String
        System.out.println(String.format("Это число %1$s %2$s",+a,b ));

        String user_name = "Misha";
        String company_name = "Microsoft";
        String result = String.format("Hello user %s. Welcome to company %s ", user_name, company_name ); //Вариант если значения меняються

        System.out.println(result);
        // другой вариант
        System.out.println("Hello user " + user_name + " Welcome to company " + company_name );
    }
}
