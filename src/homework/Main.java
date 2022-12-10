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

        int salary = 15000;
        int total = 0;
        while (total < 2_459_000) {
            total = total + total/100;
            total = total + salary;
            System.out.println("Месяц" +1 + " сумма накоплений равна " + total + " рублей");
        }


    }

    public static void task2() {

        System.out.println("\nЗадача_2");

        int i = 0;
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

        int Y=12000000;
        int birth=17/1000;
        int dead=8;

        }


    public static void task4() {

        System.out.println("\nЗадача_4");

        int salary = 15000;
        int total = 0;
        int i = 1;
        for (; total < 12_000_000; i++) {
            total = total + total/84;
            total = total + salary;
            if (i % 1 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
        System.out.println(i + " Месяцев");
    }

    public static void task5() {

        System.out.println("\nЗадача_5");

        int salary = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + total/84;
            total = total + salary;
            if (i % 1 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
        System.out.println(i + " Месяцев");
    }

    public static void task6() {

        System.out.println("\nЗадача_6");

        int salary = 15000;
        int total = 0;
        int i = 0;
        for (; total < 12_000_000; i++) {
            total = total + total/84;
            total = total + salary;
            if (i % 1 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            }
        }
        System.out.println(i + " Месяцев");
    }

    public static void task7() {

        System.out.println("\nЗадача_7");
    }

    private static void task8() {

        System.out.println("\nЗадача_8");

    }
}


