package hw;

public class Main {
    public static void main(String[] args) {
        checkYear(2021);
    }

    private static void checkYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " — високосный год");
            } else {
                System.out.println(year + " — не високосный год");
            }
        }
    }