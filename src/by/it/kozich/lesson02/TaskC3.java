package by.it.kozich.lesson02;

import java.util.Locale;
import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1. Метод getWeight(int weight) должен быть статическим.
2. Метод getWeight должен возвращать значение типа double.
3. Метод getWeight должен обязательно (!) округлять до сотых возвращаемое значение типа double.
4. Метод getWeight не должен ничего выводить на экран.
5. Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.

Пример:

Ввод:
75

Вывод:
29.51


*/
class TaskC3 {

    public static double getWeight (int weight){

        double coef = 3.86 / 9.81;
        return weight * coef;
    }

    public static void main(String[] args) {

        Locale.setDefault(new Locale("en", "US"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите вес в килограммах:");

        int i = scanner.nextInt();
        //System.out.printf("%.2f%n", getWeight(i));

        //System.out.println("29.51");

        //System.out.println(String.format(Locale.ROOT, "%.2f", getWeight(i)));

        System.out.printf("%.2f%n", getWeight(i));

    }
}
