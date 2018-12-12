package by.it.kozich.lesson02.lesson03;
/*
    Сумма цифр четырехзначного числа

    Реализуйте метод sumDigitsInNumber(int number).
    Метод на вход принимает целое четырехзначное число.
    Нужно посчитать сумму цифр этого числа, и вернуть эту сумму.

    Пример:
    Метод sumDigitsInNumber вызывается с параметром 5467.

    Пример вывода:
    22

    Требования:
    1. В методе sumDigitsInNumber не могут быть использованы никакие дополнительные классы.
    2. Метод sumDigitsInNumber(int) должен быть не приватным и статическим.
    3. Метод sumDigitsInNumber должен возвращать значение типа int.
    4. Метод sumDigitsInNumber не должен ничего выводить на экран.
    5. Метод sumDigitsInNumber должен правильно возвращать сумму всех цифр в числе number.
*/
public class TaskC2 {
    static int sumDigitsInNumber (int zzzz) {
        int pos3 = (zzzz / 1000) % 10;
        int pos2 = (zzzz / 100) % 10;
        int pos1 = (zzzz / 10) % 10;
        int pos0 = (zzzz / 1) % 10;
        return pos0 + pos1 + pos2 + pos3;
    }


public static void main(String[] args) {
System.out.println(sumDigitsInNumber(5467));
 }

}
