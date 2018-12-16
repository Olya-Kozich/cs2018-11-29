package by.it.kozich.lesson02;
import java.util.Scanner;


/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите два целых числа с основанием 10 через пробел:");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        int var_sum = number1 + number2;

        System.out.println("DEC:" + number1 + "+" + number2 + "=" + (number1 + number2));

        // Двоичная форма
        String a = Integer.toBinaryString(number1);
        String b = Integer.toBinaryString(number2);
        //System.out.println("BIN: " + Integer.toBinaryString(a) + "+" + Integer.toBinaryString(b) + "=" + Integer.toBinaryString(a + b));
        System.out.println("BIN:" + a + "+" + b + "=" + Integer.toBinaryString(var_sum));

        // Шеснадцатиричная форма
        String e = Integer.toHexString(number1);
        String f = Integer.toHexString(number2);
        //System.out.println("HEX: " + Integer.toHexString(e) + "+" + Integer.toHexString(f) + "=" + Integer.toHexString(e + f));
        System.out.println("HEX:" + e + "+" + f + "=" + Integer.toHexString(var_sum));

        // Восьмиричная форма
        String c = Integer.toOctalString(number1);
        String d = Integer.toOctalString(number2);
        //System.out.println("OCT: " + Integer.toOctalString(c) + "+" + Integer.toOctalString(d) + "=" + Integer.toOctalString(c + d));
        System.out.println("OCT:" + c + "+" + d + "=" + Integer.toOctalString(var_sum));



    }

}