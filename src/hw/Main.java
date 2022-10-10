package hw;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        checkYear(2021);
        getDeviceLink(0, 2015);
        int deliveryDays = calculateDeliveryDays(95);
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " — високосный год");
        } else {
            System.out.println(year + " — не високосный год");
        }
    }

    public static void getDeviceLink(int osType, int clientDeviceYear) {
        if (osType != 1 && osType != 0) {
            throw new IllegalArgumentException("Не правильный тип операционной системы");
        }
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear > currentYear) {
            throw new IllegalArgumentException("Не правильный год выпуска");
        }
        String osString = osType == 0 ? "iOS" : "Android";
        String versionString = clientDeviceYear > 2015 ? "полную" : "облегченную";
        System.out.printf("Установите %s версию приложения для %s по ссылке", versionString, osString);
        System.out.println();
    }

    public static int calculateDeliveryDays(int deliveryDistance) {
        if (deliveryDistance <= 20) {
            return 1;
        } else {
            return (int) Math.round((double) deliveryDistance / 40) + 1;
            }
        }
    }