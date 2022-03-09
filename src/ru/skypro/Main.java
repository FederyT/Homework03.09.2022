package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание 1
        int i = 1;
        while (i < 11) {
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (int m = 10; m > 0; m--) {
            System.out.print(m + " ");
        }
        System.out.println();


        // Задание 2 (за пример взят март этого года)
        for (int f= 4; f<31; f = f+7)  {
            System.out.println("Сегодня пятница," + f + "-е число. Необходимо подготовить отчет.");
        }


        //Задание 3
        int yearNowadays=2022;
        int twohundred = 200;
        for (int Cometa = 0; Cometa <2122; Cometa = Cometa +79) {

            if (Cometa > yearNowadays-twohundred ) {
                System.out.println( Cometa);
            }
        }
    }
}