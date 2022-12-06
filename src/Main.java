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
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
    }

    private static void task1() {
        System.out.println("Задание №1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задание №2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задание №3");
        for (int i = 0; i <= 17; i += 2) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void task4() {
        System.out.println("Задание №4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task5() {
        System.out.println("Задание №5");
        for (int i = 1904; i <= 2096; i++) {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.println(i + " год является високосным ");
            }
        }
    }

    private static void task6() {
        System.out.println("Задание №6");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task7() {
        System.out.println("Задание №7");
        for (int i = 1; i <= 512; i *= 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void task8() {
        System.out.println("Задание №8");
        int deposit = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += deposit;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task9() {
        System.out.println("Задание №9");
        int deposit = 29_000;
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total += deposit;
            total += total / 100;
//            проценты считаю после депозита, так как по условию задачи можно понять, что вклад сделали сразу же
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
    }

    private static void task10() {
        System.out.println("Задание №10");
        int num1 = 1;
        int num2 = 1;
        int num;
        System.out.print(num1 + " " + num2 + " ");
        for (int i = 3; i <= 11; i++) {
            num = num1 + num2;
            num1 = num2;
            num2 = num;
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static void task11() {
        System.out.println("Задание №11");
        int deposit = 15_000;
        int total = 0;
        int month = 1;
        while (total <= 2_459_000) {
            total += total / 100;
//            проценты считаю сразу, так как по условию сначала у нас на счету 0 рублей и только потом внесли 15_000
            total += deposit;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
    }

    private static void task12() {
        System.out.println("Задание №12");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    private static void task13() {
        System.out.println("Задание №13");
        double people = 12_000_000;
        double birth = 17;
        double birthRate = birth / 1_000;
        double mortality = 8;
        double mortalityRate = mortality / 1_000;
        for (int i = 1; i <= 10; i++) {
            people += birthRate * people - mortalityRate * people;
            System.out.println("Год " + i + ", численность населения составляет " + (int) people);
        }
    }

    private static void task14() {
        System.out.println("Задание №14");
        int total = 15_000;
        int month = 1;
        while (total <= 12_000_000) {
            total += total / 100 * 7;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
    }

    private static void task15() {
        System.out.println("Задание №15");
        int total = 15_000;
        int month = 1;
        while (total <= 12_000_000) {
            total += total / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
            month++;
        }
    }

    private static void task16() {
        System.out.println("Задание №16");
        int total = 15_000;
        int year = 9;
        int totalMonth = year * 12;
        for (int month = 1; month <= totalMonth; month++) {
            total += total / 100 * 7;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    private static void task17() {
        System.out.println("Задание №17");
        int friday = 2;
        int days = 31;
        while (friday <= days) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
    }

    private static void task18() {
        System.out.println("Задание №18");
        int yearNow = 2022;
        int yearA = yearNow - 200;
        int yearB = yearNow + 100;
        for (int cometYear = 0; cometYear <= yearB; cometYear += 79) {
            if (cometYear > yearA && cometYear < yearB) {
                System.out.println(cometYear);
            }
        }
    }
}