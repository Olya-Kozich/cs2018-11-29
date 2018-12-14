package by.it.kozich.lesson02.lesson04;

/*
Вывести таблицу умножения 10 x 10 (двоныйм циклом),
но вывод должен быть словами:

Ожидаемый вывод:
два умножить на два равно четыре
два умножить на три равно шесть
два умножить на четыре равно восемь
два умножить на пять равно десять
два умножить на шесть равно двенадцать
два умножить на семь равно четырнадцать
два умножить на восемь равно шестнадцать
два умножить на девять равно восемнадцать
два умножить на десять равно двадцать
три умножить на два равно шесть
три умножить на три равно девять
три умножить на четыре равно двенадцать
...
и т.д. до фразы
...
десять умножить на десять равно сто
*/

public class TaskC3 {

    static String getText(int i) {
        switch (i) {
            case 1: return "один";
            case 2: return "два";
            case 3: return "три";
            case 4:return "четыре";
            case 5: return "пять";
            case 6:
                return "шесть";
            case 7:
                return "семь";
            case 8:
                return "восемь";
            case 9:
                return "девять";
            case 10:
                return "десять";
            case 11:
                return "одиннадцать";
            case 12:
                return "двенадцать";
            case 13:
                return "тринадцать";
            case 14:
                return "четырнадцать";
            case 15:
                return "пятнадцать";
            case 16:
                return "шестнадцать";
            case 17:
                return "семьнадцать";
            case 18:
                return "восемнадцать";
            case 19:
                return "девятнадцать";
        }

        int d = i / 10;
        int e = i % 10;
        String end = e == 0 ? "" : " " + getText(e);

        switch (d) {
            case 2:
                return "двадцать" + end;
            case 3:
                return "тридцать" + end;
            case 4:
                return "сорок" + end;
            case 5:
                return "пятьдесят" + end;
            case 6:
                return "шестьдесят" + end;
            case 7:
                return "семьдесят" + end;
            case 8:
                return "восемьдесят" + end;
            case 9:
                return "девяносто" + end;
            case 10:
                return "сто" + end;
        }
        return "слишком много";
    }

    public static void main(String[] args) {
        for (int i = 2; i <= 10; i++) {
            for (int j = 2; j <= 10; j++) {
                System.out.println(getText(i)+ " умножить на " +  getText(j) + " равно " + getText((i*j)));

            }
        }

    }

}
