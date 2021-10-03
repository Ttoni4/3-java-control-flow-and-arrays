package com.example.task03;

public class Task03Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getNameOfWeekDays(7));
         */
    }

    static String getNameOfWeekDays(int weekDaysNumber) {
        String nameWeekDay = "";
        switch(weekDaysNumber)
        {
        case 1:
            nameWeekDay = "понедельник";
            break;

        case 2:
            nameWeekDay = "вторник";
            break;

        case 3:
            nameWeekDay = "среда";
            break;

        case 4:
            nameWeekDay = "четверг";
            break;

        case 5:
            nameWeekDay = "пятница";
            break;

        case 6:
            nameWeekDay = "суббота";
            break;

        case 7:
            nameWeekDay = "воскресенье";
            break;

        default:
            nameWeekDay = "такого дня недели не существует";
            break;
        }

        return nameWeekDay;
    }
}