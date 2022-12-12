package homework;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {

        System.out.println("\nЗадача_1");

        int save = 2459000;
        int salary = 15000;
        int total = 0;
        int month = 1;
        double procentMonthly = 0.01;

        while (total <= save) {
            total += salary + total * procentMonthly;
            System.out.printf("Месяц %d сумма накоплений равна  %d рублей%n", month, total);
            month++;
        }
    }



    public static void task2() {

        System.out.println("\nЗадача_2");

        int i;
        int total = 0;
        while (total < 10) {
            total = total +1;
            System.out.print(" " + total);
        }
        System.out.println();

        for (i= 10; i > 0; i = i - 1) {
            System.out.print(" "+ i);
        }
    }

    public static void task3() {

        System.out.println("\nЗадача_3");

        int population = 12_000_000;
        int birth = 17;
        int death = 8;
        int difference = birth - death;
        for (int year = 1; year <= 10; year++) {
            population += population * difference / 1000;
            System.out.println("Год " + year + " численность населения составляет " + population + " человек");

        }
    }


    public static void task4() {

        System.out.println("\nЗадача_4");

        int salary = 15000;
        double monthPrecent = 0.07;
        int totalMoney = 12_000_000;
        int month = 1;

        while (salary <= totalMoney) {
            salary += salary * monthPrecent;
            System.out.println("Месяц " + month + " Итого " + salary);
            month++;

        }

    }

    public static void task5() {

        System.out.println("\nЗадача_5");

        int salary = 15000;
        double monthPrecent = 0.07;
        int totalMoney = 12_000_000;
        int month = 1;

        while (salary <= totalMoney) {
            salary += salary * monthPrecent;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + salary);
            }

            month++;

        }
    }

    public static void task6() {

        System.out.println("\nЗадача_6");

        int salary = 15000;
        double monthPrecent = 0.07;
        int monthInYear = 9 * 12;
        int month = 1;

        while (month <= monthInYear) {
            salary += salary * monthPrecent;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + salary);
            }

            month++;
        }
    }

    public static void task7() {

        System.out.println("\nЗадача_7");

        int friday = 2;
        int inMonth = 31;

        while (friday <= inMonth)  {
            System.out.println("Сегодня пятница " + friday + "-e число. Необходимо подготовить отчет.");
            friday +=7;

        }
    }

    private static void task8() {

        System.out.println("\nЗадача_8");

        int currentYear = 2022;
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        for (int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0)  {
                System.out.println(year);
            }
        }

    }
}


