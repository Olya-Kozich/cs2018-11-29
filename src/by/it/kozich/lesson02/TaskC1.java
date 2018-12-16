package by.it.kozich.lesson02;
import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод (это вы вводите с клавиатуры):
34 26

Вывод (это должна появится в консоли, обратите внимание на пробелы и слово Sum:
Sum = 60

*/
class TaskC1 {

 public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите два целых числа через пробел:");
            int number1 = scanner.nextInt();
            int number2 = scanner.nextInt();
            int sum = number1+number2;

            System.out.println("Sum = " + sum);

            //System.out.println("Sum: " + number1+ "+" +number2+ "=" +(number1+number2));


 }
    }
