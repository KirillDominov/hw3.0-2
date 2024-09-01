public class Main {
    public static void main(String[] args) {
        System.out.println("Задача № 1");
        byte clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        System.out.println();
        System.out.println("Задача № 2");
        byte clientDeviceOS = 1;
        int clientDeviceYear = 2013;
        if ((clientDeviceOS == 0) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if ((clientDeviceOS == 1) && (clientDeviceYear < 2015)) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015) {
            System.out.println("Установите приложение");
        }
        System.out.println();
        System.out.println("Задача № 3");
        int year = 2024;
        if ((year % 400 == 0) || (year % 4 == 0)) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else System.out.println(year + " год не является високосным");
        System.out.println();
        System.out.println("Задача № 4");
        int deliveryDistance = 95;
        int deliveryDay = 1;
        if (deliveryDistance < 20) {
            System.out.println("Потребуется дней " + deliveryDay);
        } else if ((deliveryDistance > 20) && (deliveryDistance < 60)) {
            System.out.println("Потребуется дней " + (deliveryDay + 1));
        } else if ((deliveryDistance > 60) && (deliveryDistance < 100)) {
            System.out.println("Потребуется дней " + (deliveryDay + 2));
        } else {
            System.out.println("Доставки нет");
        }
        System.out.println();
        System.out.println("Задача № 5");
        int mounthNumber = 12;
        switch (mounthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}