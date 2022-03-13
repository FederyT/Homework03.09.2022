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
        for (int f = 4; f < 31; f = f + 7) {
            System.out.println("Сегодня пятница," + f + "-е число. Необходимо подготовить отчет.");
        }


        //Задание 3
        int yearNowadays = 2022;
        int twohundred = 200;
        for (int Cometa = 0; Cometa < 2122; Cometa = Cometa + 79) {

            if (Cometa > yearNowadays - twohundred) {
                System.out.println(Cometa);
            }
        }

        // Задание 4

        for (int t = 1; t <= 30; t++) {
            if ((t % 3 != 0) && (t % 5 != 0)) {
                System.out.println(t);
            }
            if (t % 3 == 0 && t % 5 == 0) {
                System.out.println("pingPong");
            } else if (t % 3 == 0) {
                System.out.println("ping");
            } else if (t % 5 == 0) {
                System.out.println("pong");

            }

        }

        //Задание 5
        int a = 0;
        int b = 1;
        for (int r = 2; r <= 9; ++r) { //здесь 9 т к по условию нужно вывести до 34
            int next = a + b;
            a = b;
            b = next;
            System.out.print(b + " ");
        }


        //Задание 6

        int age = 19;
        int salary = 58_000;

        double limit = salary;
        if (age >= 23) {
            limit *= 3;
        } else {
            limit *= 2;
        }
        if (salary >= 80_000) {
            limit *= 1.5;
        } else if (salary >= 50_000) {
            limit *= 1.2;
        }
        System.out.println("Мы готовы вам выдать карту с лимитом " + limit + "рублей");


        //Задание 7

            int agee = 25;
            double salar = 60_000;
            double wantedSum = 330_000;
            double baseRate = 0.1; // спроцентная ставка
            int creditmonths = 12;   // срок кредитования
            double maxSalary = salar * 50 / 100;
            double creditRate;
            if (agee < 23) {
                baseRate = baseRate + 0.01;
            } else
            if (agee >=23) {
                baseRate = baseRate - 0.05;
            }
            if (salar >= 80_000) {
                baseRate = baseRate - 0.07;
            }else
                if (salar<80_000){
                    baseRate = baseRate;
            }
            creditRate =(wantedSum+wantedSum*baseRate)/creditmonths;
                if (maxSalary > creditRate) {
                    System.out.println("Максимальный платеж при ЗП " + salar + " равен " + maxSalary + ". Платеж по кредиту " + creditRate + " рублей." + " Одобрено");
            } else
                if (maxSalary < creditRate) {
                System.out.println("Максимальный платеж при ЗП " + salar + " равен " + maxSalary + ". Платеж по кредиту " + creditRate + " рублей." + " Отказать");
            }

            }
        }



