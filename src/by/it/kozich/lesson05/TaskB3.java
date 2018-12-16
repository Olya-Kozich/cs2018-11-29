package by.it.kozich.lesson05;

/*
Минимум и максимум
1. Создать массив m на 10 целых чисел.
2. Ввести в него значения с клавиатуры.
3. Отсортируйте массив любым способом
4. Выполните вычисление новых (после сортировки) индексов первого и последнего элемента
исходного массива и выведите их в виде:
Index of first element=???
Index of last element=???

Например, для такого ввода
123 99 88 77 66 5 4 3 0 2

ожидается такой вывод:
Index of first element=9
Index of last element=1

*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TaskB3 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Заполнение массива числами");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int mas[] = new int[10];
        for (int i = 0; i < mas.length; i++) {
            //mas[i] =  (int)(Math.random() * 100);
            String string = reader.readLine();
            mas[i] = Integer.parseInt(string);
            System.out.print(mas[i] + "  ");
        }

        int unsorted[] = mas.clone();
        Arrays.sort(mas);
        System.out.println("\n Отсортированный массив");

        for (int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + "  ");
        }

        System.out.println("\n индексы");

        int ind2 = -2;
        int ind1 = -2;

        for(int i = 0; i < unsorted.length; i++){
            if(unsorted[i]==mas[0]){
                ind1 = i+1;
            }
            if(unsorted[i]==mas[mas.length-1]){
                ind2 = i+1;
            }
        }

        System.out.println("Index of first element=" + ind1);
        System.out.println("Index of last element=" + ind2);
    }


        }
