package com.example.task02;

public class Task02Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        System.out.println(getSeason(12));
         */
    }

    static String getSeason(int monthNumber) {
        monthNumber = monthNumber % 12;

        String seasonName = "";

        if(monthNumber < 3)
            seasonName = "зима";

        else if(monthNumber < 6)
            seasonName = "весна";

        else if(monthNumber < 9)
            seasonName = "лето";

        else
            seasonName = "осень";

        return seasonName;
    }
}