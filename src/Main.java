public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        checkIsLeapYear(2023);
    }

    public static void checkIsLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не високосным");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        printOsVersion(0, 2023);
    }

    public static void printOsVersion(int os, int year) {
        if (os == 1) {
            if (year <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите  версию приложения для Android по ссылке");
            }
        } else {
            if (year <= 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int delivery = calculateDeliveryTime(95);
        if (delivery > 0) {
            System.out.println("Потребуется дней " + delivery);
        } else {
            System.out.println("Доставки нет");
        }
    }

    public static int calculateDeliveryTime(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance <= 100) {
            return 3;
        } else {
            return -1;
        }
    }
}